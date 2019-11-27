package com.lti.controller;

import java.awt.Choice;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Score;
import com.lti.services.ScoreService;

@Controller
public class ScoreController {
	
	@Autowired
	ScoreService service;
	
	
@RequestMapping("/allScore")
public ModelAndView allScore()
{
	List<Score> list = service.allScores();
	
	ModelAndView model=null;
	
	if(list==null)
	{
		
	}
	else
	{
		model=new ModelAndView("viewAll");
		model.addObject("score", list);
	}
	return model;
	}
}
