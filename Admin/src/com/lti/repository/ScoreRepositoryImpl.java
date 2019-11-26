package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Score;

@Repository("scoreRepository")
public class ScoreRepositoryImpl implements ScoreRepository {

	@PersistenceContext
	EntityManager em;
	
	
	@Override
	@Transactional
	public Score addScore(Score score) {
		// TODO Auto-generated method stub
		em.persist(score);
		return score;
	}

	@Override
	public List<Score> allScores() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Score> findAllScoreById(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
