package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Technologies;
@Repository("technologiesRepository")
public class TechnologiesRepositoryImpl implements TechnologiesRepository {
	 @PersistenceContext
	    EntityManager em;
	 
	   @Transactional
	   @Override
	public Technologies addTechnologies(Technologies t) {
		   em.persist(t);
		   return t;
	}

	@Override
	public void updateTechnolgies(Technologies t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Technologies> findAllTechnologies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Technologies findTechnolgies(int technology_id) {
			Technologies t=em.find(Technologies.class, technology_id);
			return t;
	}
	
	

}
