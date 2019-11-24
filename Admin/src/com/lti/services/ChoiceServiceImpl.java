package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Choices;
import com.lti.repository.ChoiceRepository;


@Service("ChoiceService")
public class ChoiceServiceImpl implements ChoiceService
{
	@Autowired
	ChoiceRepository repository;
	
	@Override
	public List<Choices> findAllChoices()
	{

		return	repository.findAllChoices();
	
	}

	@Override
	@Transactional
	public Choices addChoices(Choices c) {
		// TODO Auto-generated method stub
		return repository.addChoices(c);
	}
	
	
	
	
}
