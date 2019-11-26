package com.lti.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Result;
import com.lti.repository.ResultRepository;

@Service("resultService")
public class ResultServiceImpl implements ResultServices {

	@Autowired
	ResultRepository repository;
	
	@Override
	@Transactional
	public Result addScore(Result result) {
		// TODO Auto-generated method stub
		return repository.addScore(result);
	}

}
