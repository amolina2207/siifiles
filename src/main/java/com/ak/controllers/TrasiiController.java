package com.ak.controllers;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ak.models.KeyAsString;
import com.ak.models.TrasiiBean;
import com.ak.models.TrasiiKey;
import com.ak.services.TrasiiService;
import com.ak.utils.CountersUtils;

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
        tmpResult.forEach(aBean -> aBean.setKeySelectedRow());
        return tmpResult;
	}

    @RequestMapping(value = "/trasii/procesar", method = RequestMethod.POST, produces = {"application/json"})
    public List<TrasiiBean> procesarRegistros(@RequestBody KeyAsString registros) {
    	
    	// Pretty Java 8 way
    	Optional<KeyAsString> optionalKeys = Optional.ofNullable(registros);
    	if(optionalKeys.isPresent()){
    		KeyAsString keys = optionalKeys.get();
    		Optional<TreeMap<String,TrasiiKey>> optKeyBeans = Optional.ofNullable(keys.convertToKeys());
    		if(optKeyBeans.isPresent() && optKeyBeans.get().size()>0){
    			Optional<BigDecimal> tmpNumP = Optional.ofNullable(CountersUtils.randomIdGenerator());
    			if(tmpNumP.isPresent()){
    				trassiService.procesarRegistros(optKeyBeans.get(), tmpNumP.get());
    			}
    		}
    	}
    	
    	// Even prettier way and safe!
    	/*Optional<KeyAsString> optionalKeys = Optional.ofNullable(registros);
    	Optional<BigDecimal> numeroProceso = optionalKeys
    			.flatMap(keysAsString -> Optional.ofNullable(keysAsString.convertToKeys()))
    			.flatMap(realKeys -> Optional.ofNullable(CountersUtils.randomIdGenerator()))
    			.ifPresent(System.out::println);*/
    	
    	// Typical way
//        if(registros != null) {
//            TreeMap<String,TrasiiKey> tmpKeysSelected = registros.convertToKeys();
//            if(tmpKeysSelected != null && tmpKeysSelected.size()>0){
//                BigDecimal tmpNumProcess = CountersUtils.randomIdGenerator();
//                if(tmpNumProcess != null && tmpNumProcess.compareTo(new BigDecimal("0")) > 0){
//                    trassiService.procesarRegistros(tmpKeysSelected,tmpNumProcess);
//                    // trassiService.insertControl();
//                }
//            }
//        }
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
            @RequestBody TrasiiBean updatedEntity){
    	
        TrasiiKey tmpKey = new TrasiiKey();
        tmpKey.setCompaak(compaak);
        tmpKey.setEmpresa(empresa);
        tmpKey.setEjercio(ejercio);
        tmpKey.setPeriodo(periodo);
        tmpKey.setEminif(eminif);
        tmpKey.setFacnum(facnum);
        tmpKey.setFacfec(facfec);
        tmpKey.setFacter(facter);
        updatedEntity.setId(tmpKey);

        TrasiiBean tmpResult = trassiService.save(updatedEntity);
        if(tmpResult != null){
            return tmpResult;
        }
        return null;
    }


}
