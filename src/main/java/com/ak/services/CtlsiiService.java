package com.ak.services;

import com.ak.models.CtlsiiBean;
import com.ak.models.TrasiiBean;
import com.ak.models.TrasiiKey;
import com.ak.repositories.CtlsiiRepository;
import com.ak.repositories.TrasiiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

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


}
