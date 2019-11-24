package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Levels;
@Repository("levelsRepository")
public class LevelsRepositoryImpl  implements LevelsRepository {

	 @PersistenceContext
	 EntityManager em;
	 
	 @Transactional
	 @Override
	public Levels addLevels(Levels l) {
		   em.persist(l);
		   return l;
	}


	@Override
	public List<Levels> findAllLevels() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateLevels(Levels l) {
		// TODO Auto-generated method stub	
	}


	@Override
	public Levels findLevels(int level_id) {
		// TODO Auto-generated method stub
		Levels l = em.find(Levels.class, new Integer(level_id));
		return l;
	}

}
