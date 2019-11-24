package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Choices;
import com.lti.model.Questions;
import com.lti.services.ChoiceService;
import com.lti.services.QuestionService;

@Controller
public class ChoiceController

{

	@Autowired
	QuestionService questionService;
	
	@Autowired
	ChoiceService service;
	
	@RequestMapping(value="/addChoices" , method = RequestMethod.POST)
	public ModelAndView addChoices(@RequestParam int question_id ,String choice_1,String choice_2,String choice_3,String choice_4,String correct_ans)
	{
		Questions q = questionService.findQuestions(question_id);
		
		Choices c = new Choices();
		c.setQuestion(q);
		c.setChoice_1(choice_1);
		c.setChoice_2(choice_2);
		c.setChoice_3(choice_3);
		c.setChoice_4(choice_4);
		c.setCorrect_ans(correct_ans);
		
		Choices c1 = service.addChoices(c);
		
		ModelAndView model= null;
		if(c1==null)
		{
			model = new  ModelAndView("addFailed");
		}
		else
		{
			model = new  ModelAndView("addSuccess");
			model.addObject("choices",c1);
		}
		return model;
	}
	
	
	
	
	
	
	@RequestMapping(value = "/findAllQuestionsWithChoice1")
	public ModelAndView fetchAllWithChoice() {
		
		//System.out.println("in controller");
		List<Choices> list = service.findAllChoices();
		ModelAndView model=null;
		if(list==null)
		{
			model=new ModelAndView("addFailed");
		}
		else
		{
			model=new ModelAndView("displayQuestionWithChoices");
			model.addObject("choices", list);
		}
		System.out.println(list);
		
		return model;
	}
	
}
