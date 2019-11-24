package com.lti.repository;

import java.util.List;

import com.lti.model.Levels;
import com.lti.model.Technologies;

public interface LevelsRepository
{

	public Levels addLevels(Levels l);
	public void updateLevels(Levels l);
	
	public List<Levels> findAllLevels();
	
	public Levels findLevels(int level_id);
}
