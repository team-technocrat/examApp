package com.lti.services;

import java.util.List;

import com.lti.model.Score;

public interface ScoreService {
	
public Score addScore(Score score);
	
	public List<Score> allScores();
	
	public List<Score> findAllScoreById(int user_id);


}
