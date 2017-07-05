package com.ak.services;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ak.models.CtlsiiBean;
import com.ak.models.CtlsiiKey;
import com.ak.models.TrasiiBean;
import com.ak.models.TrasiiKey;
import com.ak.repositories.TrasiiRepository;

/**
 * Created by amolina on 22/05/17.
 */
@Service
public class TrasiiService {

	private static final int SEGUNDOS_POR_FACTURA = 2;
	
	private static final Logger LOGGER = Logger.getLogger(EnvioSiiService.class.getName());
	
	@Value("${siiprops.pathfiles}")
	private String pathfiles;
	
    @Autowired
    private CtlsiiService ctlsiiService;
    
    @Autowired
    private EnvioSiiService envioSiiService;
    
    @Autowired
    private TrasiiRepository repository;
    
    public List<TrasiiBean> findAll(){
    	List<TrasiiBean> tmpResult = repository.findAll();
        return tmpResult;
    }

    public void procesarRegistros(TreeMap<String,TrasiiKey> aKeys, BigDecimal aNumPro) throws Exception{
        TrasiiBean inBean;
        CtlsiiBean ctlBean;
        CtlsiiKey keyBean;
        String tmpCompany = null, tmpEmpresa = null, tmpModo = null;
        
//        // TODO: Provisional
//        repository.fixForTrasiiFacnumWithBlanks();
        
        // Marco todos los registros seleccionados con un numero de proceso
        for(TrasiiKey inKey : aKeys.values()) {
            inBean = repository.findOne(inKey);
            if(inBean == null) throw new Exception("No se ha podido recuperar el registro ["+inKey.toString()+"]");            
            // TODO: Parche provisional
            inBean.setEmiftr(new java.sql.Date(new Date().getTime()));
            inBean.setResfer(new java.sql.Date(new Date().getTime()));
            
            inBean.setEmipro(aNumPro);
            repository.save(inBean);
            if(tmpCompany == null){
            	tmpCompany = inKey.getCompaak();
            	tmpEmpresa = inKey.getEmpresa();
            	tmpModo = inKey.getFacter();
            }
        }
        // Inserto un registro en la tabla de control con el numero de proceso
        ctlBean = new CtlsiiBean();
        keyBean = new CtlsiiKey();
        keyBean.setCompaak(tmpCompany);
        keyBean.setEmpresa(tmpEmpresa);
        keyBean.setCtlpro(aNumPro);
        ctlBean.setId(keyBean);
        ctlBean.setCtlfcr();
        ctlBean.setCtlhcr();
        ctlBean.setCtlrut("");
        ctlBean.setCtluse("WEB");
        ctlsiiService.save(ctlBean);
        try {
            // Bloqueo 5 segundos para que el proceso RPG cree el XML
        	LOGGER.log(Level.INFO, "Waiting (aKeys.size() = " + aKeys.size() + " " + (int)Math.round(aKeys.size()*SEGUNDOS_POR_FACTURA) + " for the xml to complete.");
			TimeUnit.SECONDS.sleep(((int)Math.ceil(aKeys.size()/SEGUNDOS_POR_FACTURA) + SEGUNDOS_POR_FACTURA));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        envioSiiService.procesarFicheroYGuardarResultado(getPathfiles()+"SII_"+aNumPro+".xml",aKeys,tmpModo);
    }
    
    public TrasiiBean findById(String compaak,String empresa,BigDecimal ejercio,String periodo,String eminif,String facnum,String facfec,String facter) {
    	
//    	// TODO: Provisional
//        repository.fixForTrasiiFacnumWithBlanks();
    	
        TrasiiKey tmpKey = new TrasiiKey();
        tmpKey.setCompaak(compaak);
        tmpKey.setEmpresa(empresa);
        tmpKey.setEjercio(ejercio);
        tmpKey.setPeriodo(periodo);
        tmpKey.setEminif(eminif);
        tmpKey.setFacnum(facnum);
        tmpKey.setFacfec(facfec);
        tmpKey.setFacter(facter);
        return repository.findOne(tmpKey);
    }

    public TrasiiBean findOne(TrasiiKey tmpKey){
    	
//    	// TODO: Provisional
//        repository.fixForTrasiiFacnumWithBlanks();
    	
        return repository.findOne(tmpKey);
    }

    public TrasiiBean save(TrasiiBean data){
        return repository.save(data);
    }

	public String getPathfiles() {
		return pathfiles;
	}

	public void setPathfiles(String pathfiles) {
		this.pathfiles = pathfiles;
	}


}
