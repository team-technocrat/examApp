package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.services.UserExamServices;

@Controller
public class UserExamController {

	@Autowired
	UserExamServices service;
	
	@RequestMapping(value="/submit" , method = RequestMethod.POST)
	public String addExam()
	{
		return "result";
	}
	
	
}
