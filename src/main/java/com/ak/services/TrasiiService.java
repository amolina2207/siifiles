package com.ak.services;

import com.ak.models.CtlsiiBean;
import com.ak.models.CtlsiiKey;
import com.ak.models.TrasiiBean;
import com.ak.models.TrasiiKey;
import com.ak.repositories.TrasiiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by amolina on 22/05/17.
 */
@Service
public class TrasiiService {

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

    public void procesarRegistros(List<TrasiiKey> aKeys, BigDecimal aNumPro){
        TrasiiBean inBean;
        CtlsiiBean ctlBean;
        CtlsiiKey keyBean;
        // Marco todos los registros seleccionados con un numero de proceso
        for(TrasiiKey inKey : aKeys) {
            inBean = repository.findOne(inKey);
            inBean.setEmipro(aNumPro);
            repository.save(inBean);
        }
        // Inserto un registro en la tabla de control con el numero de proceso
        ctlBean = new CtlsiiBean();
        keyBean = new CtlsiiKey();
        keyBean.setCompaak(aKeys.get(0).getCompaak());
        keyBean.setEmpresa(aKeys.get(0).getEmpresa());
        keyBean.setCtlpro(aNumPro);
        ctlBean.setId(keyBean);
        ctlBean.setCtlfcr();
        ctlBean.setCtlhcr();
        ctlBean.setCtlrut("");
        ctlBean.setCtluse("WEB");
        ctlsiiService.save(ctlBean);
        // Bloqueo 5 segundos para que el proceso RPG cree el XML
        try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        // envioSiiService.procesarFicheroYGuardarResultado("SII_"+aNumPro+".XML",aKeys);
        envioSiiService.procesarFicheroYGuardarResultado("Z:\\SII\\SII_2017053112.XML",aKeys);
    }
    
    public TrasiiBean findById(String compaak,String empresa,BigDecimal ejercio,String periodo,String eminif,String facnum,String facfec,String facter) {
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
        return repository.findOne(tmpKey);
    }

    public TrasiiBean save(TrasiiBean data){
        return repository.save(data);
    }


}
