package com.ak.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ak.models.CtlsiiBean;
import com.ak.models.CtlsiiKey;

/**
 * Created by amolina on 22/05/17.
 */
@Repository
public interface CtlsiiRepository extends CrudRepository<CtlsiiBean, CtlsiiKey> {}