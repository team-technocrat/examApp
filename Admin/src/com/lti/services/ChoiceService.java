package com.lti.services;

import java.util.List;

import com.lti.model.Choices;

public interface ChoiceService
{
	public Choices addChoices(Choices c);
	
	public List<Choices> findAllChoices();
	
}
