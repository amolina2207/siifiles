package com.ak.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ak.models.CtlsiiBean;

@Repository
@Transactional
public class CtlsiiDao {

	@PersistenceContext
	private EntityManager em;
	
	public void create(CtlsiiBean aBean) {
		em.persist(aBean);
		em.flush();
		em.clear();
	}
	
}