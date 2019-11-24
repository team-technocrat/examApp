package com.lti.repository;

import java.util.List;

import com.lti.model.Technologies;

public interface TechnologiesRepository
{
	public Technologies addTechnologies(Technologies t);
	public void updateTechnolgies(Technologies t);
	
	public List<Technologies> findAllTechnologies();
	public Technologies findTechnolgies(int technology_id);
}
