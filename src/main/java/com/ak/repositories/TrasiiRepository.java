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

    // Numero de proceso
    /*@Modifying
    @Query("update trasii set resdes = :numeroProceso where compaak = :compaak and ejercio = :ejercio and periodo = :periodo and eminif = :eminif and facnum = :facnum and facfec = :facfec and facter = :facter")
    int setResdesForTrasii(@Param("compaak") String compaak,
                                  @Param("empresa") String empresa,
                                  @Param("ejercio") BigDecimal ejercio,
                                  @Param("periodo") String periodo,
                                  @Param("eminif") String eminif,
                                  @Param("facnum") String facnum,
                                  @Param("facfec") String facfec,
                                  @Param("facter") String facter,
                                  @Param("numeroProceso") String numeroProceso);*/





}