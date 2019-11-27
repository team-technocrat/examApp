package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Questions;
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
		String q1="select s from Score s";
		javax.persistence.TypedQuery<Score> query=em.createQuery(q1,Score.class);
		List<Score> l=query.getResultList();
		return l;
	}

	@Override
	public Score findAllScoreById(int user_id) {
		// TODO Auto-generated method stub
		Score s = em.find(Score.class, new Integer(user_id));
		return s;
	}

}
