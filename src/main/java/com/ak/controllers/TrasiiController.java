package com.ak.controllers;

import com.ak.models.*;
import com.ak.services.CtlsiiService;
import com.ak.services.TrasiiService;
import com.ak.utils.CountersUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by amolina on 19/05/17.
 */

@CrossOrigin
@RestController
public class TrasiiController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private final static String UNIQUE_PATH = "/trasii/{compaak}/{empresa}/{ejercio}/{periodo}/{eminif}/{facnum}/{facfec}/{facter}";

    @Autowired
    private TrasiiService trassiService;



    @RequestMapping(value = "/trasii", method = RequestMethod.GET, produces = {"application/json"})
    public List<TrasiiBean> findAll(){
        List<TrasiiBean> tmpResult = trassiService.findAll();
        return tmpResult;
    }

    @RequestMapping(value = "/trasii/procesar", method = RequestMethod.POST, produces = {"application/json"})
    public List<TrasiiBean> procesarRegistros(@RequestBody KeyAsString registros) {
        if(registros != null) {
            List<TrasiiKey> tmpKeysSelected = registros.convertToKeys();
            if(tmpKeysSelected != null && tmpKeysSelected.size()>0){
                BigDecimal tmpNumProcess = CountersUtils.randomIdGenerator();
                if(tmpNumProcess != null && tmpNumProcess.compareTo(new BigDecimal("0")) > 0){
                    // trassiService.procesarRegistros(tmpKeysSelected,tmpNumProcess);
                    trassiService.insertControl();
                }
            }
        }
        List<TrasiiBean> tmpResult = trassiService.findAll();
        return tmpResult;
    }

    @RequestMapping(value = UNIQUE_PATH, method = RequestMethod.GET, produces = {"application/json"})
    public TrasiiBean findOne(
            @PathVariable String compaak,
            @PathVariable String empresa,
            @PathVariable BigDecimal ejercio,
            @PathVariable String periodo,
            @PathVariable String eminif,
            @PathVariable String facnum,
            @PathVariable String facfec,
            @PathVariable String facter
            ){
        TrasiiBean tmpResult = trassiService.findById(compaak,empresa,ejercio,periodo,eminif,facnum,facfec,facter);
        if(tmpResult != null){
            return tmpResult;
        }
        return null;
    }

    @RequestMapping(value = UNIQUE_PATH, method = RequestMethod.POST, produces = {"application/json"})
    public TrasiiBean save(
            @PathVariable String compaak,
            @PathVariable String empresa,
            @PathVariable BigDecimal ejercio,
            @PathVariable String periodo,
            @PathVariable String eminif,
            @PathVariable String facnum,
            @PathVariable String facfec,
            @PathVariable String facter,
            @RequestBody TrasiiBean data){

        TrasiiKey tmpKey = new TrasiiKey();
        tmpKey.setCompaak(compaak);
        tmpKey.setEmpresa(empresa);
        tmpKey.setEjercio(ejercio);
        tmpKey.setPeriodo(periodo);
        tmpKey.setEminif(eminif);
        tmpKey.setFacnum(facnum);
        tmpKey.setFacfec(facfec);
        tmpKey.setFacter(facter);
        data.setId(tmpKey);

        TrasiiBean tmpResult = trassiService.save(data);
        if(tmpResult != null){
            return tmpResult;
        }
        return null;
    }


}
