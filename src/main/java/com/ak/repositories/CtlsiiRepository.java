package com.ak.repositories;

import com.ak.models.CtlsiiBean;
import com.ak.models.CtlsiiKey;
import com.ak.models.TrasiiBean;
import com.ak.models.TrasiiKey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by amolina on 22/05/17.
 */
@Repository
public interface CtlsiiRepository extends CrudRepository<CtlsiiBean, CtlsiiKey> {}