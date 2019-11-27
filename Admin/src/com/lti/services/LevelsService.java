package com.lti.services;

import java.util.List;

import com.lti.model.Levels;

public interface LevelsService {

	public Levels addLevels(Levels l);
	
	public void updateLevels(Levels l);
	
	public List<Levels> findAllLevels();
	
	public Levels findLevels(int level_id);

}
