package com.ak.repositories;

import com.ak.models.TrasiiBean;
import com.ak.models.TrasiiKey;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by amolina on 22/05/17.
 */
@Repository
public interface TrasiiRepository extends CrudRepository<TrasiiBean, TrasiiKey> {
    List<TrasiiBean> findAll();
    
//    @Query("UPDATE TRASII A SET FACNUM = TRIM(A.FACNUM) WHERE RESCSV = '' ")
//    void fixForTrasiiFacnumWithBlanks();

}