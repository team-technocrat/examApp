package com.lti.repository;

import java.util.List;

import com.lti.model.Choices;

public interface ChoiceRepository 
{
	public Choices addChoices(Choices c);
	public List<Choices> findAllChoices();
	
	

}

