package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Levels;
import com.lti.model.Technologies;
import com.lti.services.LevelsService;
import com.lti.services.TechnologiesService;

@Controller
public class LevelController {

	
	@Autowired
	LevelsService service;
	
	@Autowired
	TechnologiesService technologyService;
	
	@RequestMapping(value="/addLevel",method=RequestMethod.POST)
	public ModelAndView addTech(@RequestParam int technology_id,String level_name)
	{
		Technologies t=technologyService.findTechnolgies(technology_id);
		System.out.println(t);
		Levels l=new Levels();
		l.setT(t);
		l.setLevelName(level_name);
		
		
		System.out.println(l);
		
		Levels l1=service.addLevels(l);
		
		System.out.println(l1);
		
		
		
		ModelAndView model = null;
		if(l1==null)
		{
			model = new  ModelAndView("addFailed");
		}
		else
		{
			model = new  ModelAndView("addSuccess");
			model.addObject("levels",l1);
		}
		
		return model;
	}
	
	
	
	
	
}
