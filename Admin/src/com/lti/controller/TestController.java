package com.lti.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Choices;
import com.lti.services.ChoiceService;

@Controller
public class TestController 
{
	@Autowired
	ChoiceService service;
	
	@RequestMapping(value = "/findAllQuestionsWithChoiceWithJSP" , method = RequestMethod.POST)
	public ModelAndView fetchAllWithChoice() {
		
		//System.out.println("in controller");
		List<Choices> list = service.findAllChoices();
		Collections.shuffle(list);
		List<Choices> finalList=new ArrayList<Choices>();
		int noOfQuestions=10;
		int counter=0;
		
		for(Choices c: list)
		{
			counter++;
			finalList.add(c);
			
			if(counter>noOfQuestions)
			{
				break;
			}
		}
		
		System.out.println("List:\n "+finalList + "\n");
		ModelAndView model=null;
		if(list==null)
		{
			model=new ModelAndView("addFailed");
		}
		else
		{
				model=new ModelAndView("QuestionDisplayJSP");
				model.addObject("choices", finalList);
		}
		System.out.println("Console Output:"+finalList);
		
		return model;
	}
	
	
	

	@RequestMapping(value = "/findAllQuestionsWithChoice2", method=RequestMethod.POST)
	public ModelAndView fetchAllWithChoiceWithJSP() {
		
		List<Choices> list = service.findAllChoices();
		Collections.shuffle(list);
		List<Choices> finalList=new ArrayList<Choices>();
		
		
			ModelAndView model=null;
		
		if(finalList==null)
		{
			model = new  ModelAndView("addFailed");
		}
		else
		{
			for(int i=0;i<10;i++)
			{
			model = new  ModelAndView("addSuccess");
			model.addObject("choices",finalList);
			
			}
		}
		return model;
	}
	
}
