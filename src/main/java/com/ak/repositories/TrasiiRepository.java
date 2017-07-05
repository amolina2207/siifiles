package com.ak.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ak.models.TrasiiBean;
import com.ak.models.TrasiiKey;

/**
 * Created by amolina on 22/05/17.
 */
@Repository
public interface TrasiiRepository extends CrudRepository<TrasiiBean, TrasiiKey> {
    List<TrasiiBean> findAll();
    
//    @Query("UPDATE TRASII A SET FACNUM = TRIM(A.FACNUM) WHERE RESCSV = '' ")
//    void fixForTrasiiFacnumWithBlanks();

}