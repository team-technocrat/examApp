package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Result;

@Repository("resultRepository")
public class ResultRepositoryImpl implements ResultRepository {

	@PersistenceContext
	EntityManager em;
	
	
	@Override
	@Transactional
	public Result addScore(Result result) {
		// TODO Auto-generated method stub
		em.persist(result);
		return result;
	}

}
