package com.ak.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ak.models.CtlsiiBean;
import com.ak.models.CtlsiiKey;
import com.ak.repositories.CtlsiiRepository;

/**
 * Created by amolina on 22/05/17.
 */
@Service
public class CtlsiiService {

    @Autowired
    private CtlsiiRepository repository;

    public CtlsiiBean save(CtlsiiBean data){
        return repository.save(data);
    }
    
    public CtlsiiBean findOne(CtlsiiKey aKey){
    	return repository.findOne(aKey);
    }
    

}
