package com.ak.services;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPMessage;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ak.models.ResultFactura;
import com.ak.models.TrasiiBean;
import com.ak.models.TrasiiKey;
import com.ak.models.WSProps;
import com.ak.repositories.TrasiiRepository;

@Service
public class EnvioSiiService {
	
	@Autowired
	private TrasiiRepository trasiiRepository;
	
	@Autowired
	private WSProps wsprops;
	
	private StringBuffer sb;
	
	private static final Logger LOGGER = Logger.getLogger(EnvioSiiService.class.getName());
	
	private void newBuffer(){
        sb = new StringBuffer();
    }

    private void addStringToBuffer(String aLine){
        sb.append(aLine);
    }
	
    private synchronized void getXmlFromFile(String aPath) throws IOException{
    	Assert.assertNotNull(aPath);
    	if(aPath.equals("")){
    		LOGGER.log(Level.SEVERE, "File path empty !!!");
    	}else{
	        newBuffer();
	        try(Stream<String> stream = Files.lines(Paths.get(aPath))) {
	            stream.forEach((line)->addStringToBuffer(line));
	        }catch(Exception e){
	        	LOGGER.log(Level.SEVERE, "ERROR : Loading file");
	        	throw new IOException();
	        }
	        LOGGER.log(Level.INFO, "File Loaded");
    	}
    }
    
    private synchronized TreeMap<String,ResultFactura> callAndReceive(String aXml, TreeMap<String, TrasiiKey> aKeys, String aModo) throws Exception {
    	getXmlFromFile(aXml);
    	TreeMap<String,ResultFactura> results = new TreeMap<String,ResultFactura>();
//        for(String elem : aKeys.keySet()){ results.put(elem.trim(), null); }
        MessageFactory factory = MessageFactory.newInstance();
        SOAPMessage message = factory.createMessage(new MimeHeaders(), new ByteArrayInputStream(sb.toString().getBytes(Charset.forName("UTF-8"))));
        SOAPElement tmpPart = null,tmpElement, tmpElementRL, tmpIdFactura;
        System.setProperty("javax.net.ssl.keyStore", wsprops.getPathCert());
        System.setProperty("javax.net.ssl.keyStoreType", wsprops.getTypeCert());
        System.setProperty("javax.net.ssl.keyStorePassword", wsprops.getPassCert());
        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();
        String tmpEndpoint = null;
        if(aModo.equals("R")){
        	tmpEndpoint = wsprops.getEndpointRecibidas();
        }else{
        	tmpEndpoint = wsprops.getEndpointEmitidas();
        }
        LOGGER.log(Level.INFO, "Endpoint => " + tmpEndpoint);
        SOAPMessage soapResponse = soapConnection.call(message, tmpEndpoint);
        LOGGER.log(Level.INFO, " ===== START Response From AEAT  ===== ");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        soapResponse.writeTo(out);
        LOGGER.log(Level.INFO, out.toString().replaceAll(" ", ""));
        LOGGER.log(Level.INFO, " ===== END Response From AEAT  ===== ");
        SOAPBody tmpBody = soapResponse.getSOAPBody();
        java.util.Iterator<?> tmpParts = tmpBody.getChildElements();
        String tmpEstado = "";
        String tmpTopCSV = "";
        ResultFactura resultFactura;
		while (tmpParts.hasNext()) {
			try {
				tmpPart = (SOAPElement) tmpParts.next();
			} catch (java.lang.ClassCastException e) {
				e.printStackTrace();
				break;
			}
			java.util.Iterator<?> items = tmpPart.getChildElements();
			while (items.hasNext()) {
				tmpElement = (SOAPElement) items.next();
				LOGGER.log(Level.INFO, "Element => " + tmpElement.getLocalName());
				if (tmpElement != null) {
					if (tmpElement.getLocalName().equals("EstadoEnvio")) {
						tmpEstado = tmpElement.getValue();
					}else if (tmpElement.getLocalName().equals("CSV")) {	
						tmpTopCSV = tmpElement.getValue();
					}else if (tmpElement.getLocalName().equals("RespuestaLinea")) {
						java.util.Iterator<?> itemsRL = tmpElement.getChildElements();
						resultFactura = new ResultFactura();
						if(!"".equals(tmpTopCSV)) resultFactura.setCsv(tmpTopCSV);
						while (itemsRL.hasNext()) {
							tmpElementRL = (SOAPElement) itemsRL.next();
							if (tmpElementRL.getLocalName().equals("IDFactura")) {
								java.util.Iterator<?> itemsIDFactura = tmpElementRL.getChildElements();
								while (itemsIDFactura.hasNext()) {
									tmpIdFactura = (SOAPElement) itemsIDFactura.next();
									if (tmpIdFactura.getLocalName().equals("NumSerieFacturaEmisor")) {
										resultFactura.setIdFactura(tmpIdFactura.getValue());
									}
								}
							// TODO: Comprobar si el campo CSV llega a este nivel
							} else if (tmpElementRL.getLocalName().equals("CSV")) {
								// resultFactura.setCsv(tmpElementRL.getValue());
							} else if (tmpElementRL.getLocalName().equals("EstadoRegistro")) {
								// TODO: Comprobar si cuando hay mas de una factura esto sigue siendo correcto
								// y otro caso a probar seria cuando hay 1 o n correctas e incorrectas. Cuidado porque esto sobreescribe el setCSV
								// de arriba.
								if(tmpElementRL.getValue().equalsIgnoreCase("Correcto")){
									// resultFactura.setCsv(tmpTopCSV);
								}
								resultFactura.setEstadoRegistro(tmpElementRL.getValue());
							} else if (tmpElementRL.getLocalName().equals("CodigoErrorRegistro")) {
								resultFactura.setErrorCode(tmpElementRL.getValue());
							} else if (tmpElementRL.getLocalName().equals("DescripcionErrorRegistro")) {
								resultFactura.setErrorDesc(tmpElementRL.getValue());
							}
						}
						results.put(resultFactura.getIdFactura(), resultFactura);
					}
				}
			}
        }
		return results;
    }
        
    public void procesarFicheroYGuardarResultado(String aPath, TreeMap<String,TrasiiKey> aKeys, String aModo){
		try {
			TreeMap<String,ResultFactura> aResults = callAndReceive(aPath, aKeys, aModo);
			if(aResults == null || ( aResults != null && aResults.size()==0 ) ){ LOGGER.log(Level.SEVERE, "No response from AEAT !!!"); throw new Exception(); }
			if(aResults.size() != aKeys.size()){ LOGGER.log(Level.SEVERE, "No se han recibidos respuestas de todas las facturas enviadas !!!"); throw new Exception(); }
			TrasiiBean aBean = null;
			ResultFactura aResultF = null;
			for(TrasiiKey aKey : aKeys.values()){
				aBean = trasiiRepository.findOne(aKey);	
				aResultF = aResults.get(aKey.getFacnum().trim());
				aBean.setRescsv(aResultF.getCsv());
				aBean.setReserr(aResultF.getErrorCode());
				aBean.setResdes(aResultF.getErrorDesc());
				// TODO :: Hablar con Manel para que haga este campo un poco mas grande
				aBean.setResfac(aResultF.getEstadoRegistro().substring(0,Math.min(aResultF.getEstadoRegistro().length(), 5)));
				trasiiRepository.save(aBean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}