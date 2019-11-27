package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Technologies;
import com.lti.repository.TechnologiesRepository;

@Service("TechnologiesService")
public class TechnologiesServiceImpl implements TechnologiesService{

	@Autowired
	TechnologiesRepository repository;
	
	@Transactional
	@Override
	public Technologies addTechnologies(Technologies t) {
		
		return repository.addTechnologies(t);
	}

	@Override
	public List<Technologies> findAllTechnologies() {
		// TODO Auto-generated method stub
		return repository.findAllTechnologies();
	}

	@Override
	public void updateTechnolgies(Technologies t) {
		// TODO Auto-generated method stub
		repository.updateTechnolgies(t);
	}
	
	@Override
	public Technologies findTechnolgies(int technology_id) {
		Technologies t=repository.findTechnolgies(technology_id);
		return t;
}

	
}
