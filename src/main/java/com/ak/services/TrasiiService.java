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

/**
 * Created by amolina on 22/05/17.
 */
@Service
public class TrasiiService {

    @Autowired
    private CtlsiiService ctlsiiService;

    @Autowired
    private TrasiiRepository repository;

    public List<TrasiiBean> findAll(){
        List tmpResult = repository.findAll();
        return tmpResult;
    }


    @Transactional
    public void insertControl(){
        CtlsiiKey keyBean = new CtlsiiKey();
        CtlsiiBean ctlBean = new CtlsiiBean();
        keyBean.setCompaak("05");
        keyBean.setEmpresa("01");
        keyBean.setCtlpro(new BigDecimal(99));
        ctlBean.setId(keyBean);
        ctlBean.setCtlrut("/home/amolina");
        ctlBean.setCtluse("AITOR");
        ctlBean.setCtlfcr();
        ctlBean.setCtlhcr();
        ctlsiiService.save(ctlBean);
        /*keyBean = new CtlsiiKey();
        ctlBean = new CtlsiiBean();
        keyBean.setCompaak("05");
        keyBean.setEmpresa("01");
        keyBean.setCtlpro(new BigDecimal(100));
        ctlBean.setId(keyBean);
        ctlBean.setCtlrut("rutaFile");
        ctlBean.setCtluse("JAVIER");
        ctlBean.setCtlfcr();
        ctlBean.setCtlhcr();
        ctlsiiService.save(ctlBean);*/
    }


    @Transactional
    public void procesarRegistros(List<TrasiiKey> aKeys, BigDecimal aNumPro){
        TrasiiBean inBean;
        CtlsiiBean ctlBean;
        CtlsiiKey keyBean;
        for(TrasiiKey inKey : aKeys) {
            inBean = repository.findOne(inKey);
            inBean.setEmipro(aNumPro);
            repository.save(inBean);
            ctlBean = new CtlsiiBean();
            keyBean = new CtlsiiKey();
            keyBean.setCompaak(inKey.getCompaak());
            keyBean.setEmpresa(inKey.getEmpresa());
            keyBean.setCtlpro(aNumPro);
            ctlBean.setId(keyBean);
            ctlBean.setCtlfcr(new java.sql.Date(new Date().getTime()));
            ctlBean.setCtlhcr(new java.sql.Time(new Date().getTime()));
            ctlBean.setCtlrut("");
            ctlBean.setCtluse("WEB");
            ctlsiiService.save(ctlBean);
        }
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

    /*
    public int setResdesForTrasii(String compaak,String empresa,BigDecimal ejercio,String periodo,String eminif,String facnum,String facfec,String facter,String numeroProceso){
        return repository.setResdesForTrasii(compaak,empresa,ejercio,periodo,eminif,facnum,facfec,facter,numeroProceso);
    }*/

    public TrasiiBean save(TrasiiBean data){
        return repository.save(data);
    }


}
