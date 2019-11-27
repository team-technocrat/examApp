package com.lti.repository;

import java.util.List;

import com.lti.model.Score;

public interface ScoreRepository {
	
	public Score addScore(Score score);
	
	public List<Score> allScores();
	
	public Score findAllScoreById(int user_id);

}
