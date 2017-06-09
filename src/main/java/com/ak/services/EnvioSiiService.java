package com.ak.services;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

import javax.xml.bind.JAXBException;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ak.models.TrasiiKey;
import com.ak.repositories.TrasiiRepository;

@Service
public class EnvioSiiService {

	@Autowired
	private TrasiiRepository trasiiRepository;
	
	private StringBuffer sb;
	
	@Value("pathCert")
	private String pathCert;
	
	@Value("typeCert")
	private String typeCert;
	
	@Value("passCert")
	private String passCert;
	
	@Value("endpoint")
	private String endpoint;
	
	/*
	@ConfigurationProperties(prefix = "wsdata")
	class WSData {
		
		String pathCert;
	    String typeCert;
	    String passCert;
	    String endpoint;
	    
		public String getPathCert() {
			return pathCert;
		}
		public void setPathCert(String pathCert) {
			this.pathCert = pathCert;
		}
		public String getTypeCert() {
			return typeCert;
		}
		public void setTypeCert(String typeCert) {
			this.typeCert = typeCert;
		}
		public String getPassCert() {
			return passCert;
		}
		public void setPassCert(String passCert) {
			this.passCert = passCert;
		}
		public String getEndpoint() {
			return endpoint;
		}
		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}
	}*/
	
	
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
	        }
	        LOGGER.log(Level.INFO, "File Loaded");
    	}
    }
    
    private synchronized void callSave(String aXml, List<TrasiiKey> aKeys) throws SOAPException, IOException, JAXBException {
        getXmlFromFile(aXml);
        MessageFactory factory = MessageFactory.newInstance();
        SOAPMessage message = factory.createMessage(new MimeHeaders(), new ByteArrayInputStream(sb.toString().getBytes(Charset.forName("UTF-8"))));
        SOAPElement tmpPart,tmpElement;
        String tmpResult = null;
        System.setProperty("javax.net.ssl.keyStore", pathCert);
        System.setProperty("javax.net.ssl.keyStoreType", typeCert);
        System.setProperty("javax.net.ssl.keyStorePassword", passCert);
        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();
        SOAPMessage soapResponse = soapConnection.call(message, endpoint);
        SOAPBody tmpBody = soapResponse.getSOAPBody();
    
        java.util.Iterator<?> tmpParts = tmpBody.getChildElements();
        while (tmpParts.hasNext()) {
            tmpPart = (SOAPElement)tmpParts.next();
            java.util.Iterator<?> items = tmpPart.getChildElements();
            while( items.hasNext() ){
                tmpElement = (SOAPElement)items.next();
                tmpResult = tmpElement.getValue();
                if (tmpResult!=null && tmpResult.length()>0 && !tmpResult.equalsIgnoreCase("Incorrecto")){
//                    try {
//                        InputStream tmpStreamXML = new ByteArrayInputStream(tmpResult.getBytes(Charset.forName("UTF-8")));
//                        JAXBContext jaxbContext = JAXBContext.newInstance(RespuestaLRFEmitidasType.class);
//                        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//                        RespuestaLRFEmitidasType respuestaFacturas = (RespuestaLRFEmitidasType) jaxbUnmarshaller.unmarshal(tmpStreamXML);
//                        System.out.println("");
//                    } catch (JAXBException e) {
//                        e.printStackTrace();
//                    }
                }
            }
        }
    }
        
    public void procesarFicheroYGuardarResultado(String aPath, List<TrasiiKey> aKeys){
		try {
			callSave(aPath, aKeys);
		} catch (SOAPException | IOException | JAXBException e) {
			e.printStackTrace();
		}
	}
}