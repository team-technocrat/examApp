package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Levels;
import com.lti.repository.LevelsRepository;


@Service("LevelsService")
public class LevelsServiceImpl implements LevelsService

{
	@Autowired
	LevelsRepository repository;
	
	@Transactional
	@Override
	public Levels addLevels(Levels l) {
		
		return repository.addLevels(l);
	}

	@Override
	public void updateLevels(Levels l) {
		// TODO Auto-generated method stub
		repository.updateLevels(l);
		
	}

	@Override
	public List<Levels> findAllLevels() {
		// TODO Auto-generated method stub
		return repository.findAllLevels();
	}

	@Override
	public Levels findLevels(int level_id) {
		// TODO Auto-generated method stub
		
		return repository.findLevels(level_id);
	}
	
}
