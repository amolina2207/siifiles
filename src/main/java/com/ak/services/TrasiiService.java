package com.ak.services;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

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
	private static final String FIN = "FIN";
	private static final Logger LOGGER = Logger.getLogger(EnvioSiiService.class.getName());
	
	@Value("${siiprops.pathfiles}")
	private String pathfiles;
	
    @Autowired
    private CtlsiiService ctlsiiService;
    
    @Autowired
    private EnvioSiiService envioSiiService;
    
    @PersistenceContext
    private EntityManager entityManager;
    
    @Autowired
    private TrasiiRepository repository;
    
    public List<TrasiiBean> findAll(){
    	List<TrasiiBean> tmpResult = repository.findAll();
        return tmpResult;
    }

    
    public void procesarRegistros(TreeMap<String,TrasiiKey> aKeys, BigDecimal aNumPro) throws Exception{
    	LOGGER.log(Level.INFO, " NUMERO DE PROCESO ========> " + aNumPro);
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
            
            EntityManagerFactory factory2 = entityManager.getEntityManagerFactory();
            EntityManager em3 = factory2.createEntityManager();
            em3.getTransaction().begin();
            
            String tmpSaveInSQL = " UPDATE TRASII "
        	+ " SET EMIPRO = " + aNumPro + ", EMIFTR = CURRENT DATE, RESFER = CURRENT DATE "
        	+ " WHERE " 
        	+ " COMPAAK='"+inBean.getId().getCompaak()+"' "
        	+ " AND EMPRESA='"+inBean.getId().getEmpresa()+"' " 
        	+ " AND EJERCIO = " + inBean.getId().getEjercio() 
        	+ " AND PERIODO='"+inBean.getId().getPeriodo()+"' "
        	+ " AND EMINIF='"+inBean.getId().getEminif()+"' "
        	+ " AND FACNUM='"+inBean.getId().getFacnum()+"' "
        	+ " AND FACFEC='"+inBean.getId().getFacfec()+"' " 
        	+ " AND FACTER='"+inBean.getId().getFacter()+"' ";
            javax.persistence.Query aSqlUpdate = em3.createNativeQuery(tmpSaveInSQL);
            aSqlUpdate.executeUpdate();
            em3.getTransaction().commit();
            
            em3.close();
//            factory2.close();
   
//            repository.save(inBean);
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
//        ctlsiiService.save(ctlBean);
        EntityManagerFactory factory = entityManager.getEntityManagerFactory();
        EntityManager em2 = factory.createEntityManager();
        em2.getTransaction().begin();
        javax.persistence.Query aSqlInsert = em2.createNativeQuery("INSERT INTO CTLSII (COMPAAK, EMPRESA, CTLPRO, CTLRUT, CTLUSE, CTLFCR, CTLHCR) VALUES ('"+tmpCompany+"', '"+tmpEmpresa+"', '"+aNumPro+"', '', 'WEB', CURRENT DATE, CURRENT TIME)");
        aSqlInsert.executeUpdate();
        em2.getTransaction().commit();
        
        em2.close();
//        factory.close();
        
        int intents = -5;
        CtlsiiBean aBeanData = null;
        javax.persistence.Query aSql = entityManager.createNativeQuery("SELECT CTLUSE FROM CTLSII WHERE COMPAAK='"+tmpCompany+"' AND EMPRESA='"+tmpEmpresa+"' AND CTLPRO='"+aNumPro+"'");
        List<String> aResults;
        String aEstado = null;
        try{
        	LOGGER.log(Level.INFO, "Before control loop"); 
        	while(intents<0){
//        		aBeanData = ctlsiiService.findOne(keyBean);
        		aResults = aSql.getResultList();
        		aEstado = (String)aResults.get(0);
        			
        		LOGGER.log(Level.INFO, "aBeanData use value " + aEstado); 
//        		if(aBeanData != null && FIN.equals(aBeanData.getCtluse().trim())){
        		if(aResults != null && aEstado != null && FIN.equals(aEstado.trim())){
        			intents=0;
        			LOGGER.log(Level.INFO, "Procesando fichero xml, intento(s) " + intents);
        			envioSiiService.procesarFicheroYGuardarResultado(getPathfiles()+"SII_"+aNumPro+".xml",aKeys,tmpModo);
        		}else{
        			intents++;
        			TimeUnit.SECONDS.sleep(5);
        		}
        	}
		}catch(InterruptedException e){
			e.printStackTrace();
		}catch(Exception ex){
			ex.printStackTrace();
		}
        if(intents==0){ LOGGER.log(Level.INFO, "El fichero se ha procesado"); }
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
    	data.setEmiftr();
    	data.setEmihcr();
    	data.setResfer();
    	data.setReshor();
    	TrasiiBean aResult = repository.save(data);
        return aResult;
    }

	public String getPathfiles() {
		return pathfiles;
	}

	public void setPathfiles(String pathfiles) {
		this.pathfiles = pathfiles;
	}


}
