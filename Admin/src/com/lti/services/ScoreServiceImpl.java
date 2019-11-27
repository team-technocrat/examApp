package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Score;
import com.lti.repository.ScoreRepository;

@Service("scoreService")
public class ScoreServiceImpl implements ScoreService {

	@Autowired
	ScoreRepository repository;
	
	
	@Override
	public Score addScore(Score score) {
		// TODO Auto-generated method stub
		return repository.addScore(score);
	}

	@Override
	public List<Score> allScores() {
		// TODO Auto-generated method stub
		return repository.allScores();
	}

	@Override
	public Score findAllScoreById(int user_id) {
		// TODO Auto-generated method stub
		return repository.findAllScoreById(user_id);
	}

}
