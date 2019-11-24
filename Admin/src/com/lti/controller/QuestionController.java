package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Choices;
import com.lti.model.Levels;
import com.lti.model.Questions;
import com.lti.model.Technologies;
import com.lti.services.ChoiceService;
import com.lti.services.LevelsService;
import com.lti.services.QuestionService;
import com.lti.services.TechnologiesService;

@Controller
public class QuestionController {
	
	@Autowired
	QuestionService service;
	
	@Autowired
	LevelsService levelService;
	
	@Autowired
	TechnologiesService technologyService;
	
	
	
	
	@RequestMapping(value="/addQuestion",method=RequestMethod.POST)
	public ModelAndView addQuestion(@RequestParam String question_desc,int technology_id,int level_id)
	{
		Technologies t = technologyService.findTechnolgies(technology_id);
		Levels l = levelService.findLevels(level_id);
		
		System.out.println(t+" -------- "+l);
		
		Questions question = new Questions();
		question.setQuestion_desc(question_desc);
		question.setTechnologies(t);
		question.setLevels(l);
		
		System.out.println(question);
		
		Questions q1 = service.addQuestion(question);
		ModelAndView model=null;
		
		if(q1==null)
		{
			model = new  ModelAndView("addFailed");
		}
		else
		{
			model = new  ModelAndView("addSuccess");
			model.addObject("questions",q1);
		}
		return model;
	}
	
	@RequestMapping(value="/updateQuestion" , method = RequestMethod.POST)
	public ModelAndView updateQuestion(@RequestParam int question_id, @RequestParam String question_desc)
	{
		Questions q = service.findQuestions(question_id); 
		q.setQuestion_desc(question_desc);
		
	
		Questions q2 = service.updateQuestion(q);
		System.out.println("\n =========== \n"+q2);
		
		ModelAndView model=null;
		if(q2==null)
		{
			model = new  ModelAndView("addFailed");
		}
		else
		{
			model = new  ModelAndView("addSuccess");
			model.addObject("questions",q2);
		}
		return model;
	}
	
@RequestMapping(value="/removeQuestion" , method = RequestMethod.POST)	
public ModelAndView removeQuestion(@RequestParam int question_id)
	{
	
	Questions q = service.findQuestions(question_id);
	System.out.println(q);
	
	service.removeQuestion(q);
	
	System.out.println(q);
	
	ModelAndView model=null;
	if(q==null)
	{
		model = new  ModelAndView("addFailed");
	}
	else
	{
		model = new  ModelAndView("addSuccess");
		model.addObject("questions",q);
	}
	return model;
	
	}

	/*
	 * @RequestMapping(value = "/findAllQuestions") public ModelAndView fetchAll() {
	 * 
	 * System.out.println("in controller"); List<Questions> list =
	 * service.findAllQuestions(); ModelAndView model=null; if(list==null) {
	 * model=new ModelAndView("addFailed"); } else { model=new
	 * ModelAndView("displayQuestion"); model.addObject("questions", list); }
	 * System.out.println(list);
	 * 
	 * return model;
	 * 
	 * 
	 * }
	 */
	
	  @RequestMapping(value = "/findQuestion") public ModelAndView
	  fetchQuestion(@RequestParam int question_id) {
	  
		  Questions q = service.findQuestions(question_id);
			System.out.println(q);
			
			
		//	System.out.println(q);
			
			ModelAndView model=null;
			if(q==null)
			{
				model = new  ModelAndView("addFailed");
			}
			else
			{
				model = new  ModelAndView("addSuccess");
				model.addObject("questions",q);
			}
			return model;
			
	  
	  
	  }
	  

		@RequestMapping(value = "/findAllQuestionsWithChoice")
		public ModelAndView fetchAllWithChoice() {
			
			//System.out.println("in controller");
			List<Questions> list = service.findAllQuestionsWithChoice();
			ModelAndView model=null;
			if(list==null)
			{
				model=new ModelAndView("addFailed");
			}
			else
			{
				model=new ModelAndView("displayQuestionWithChoices");
				model.addObject("questions", list);
			}
			System.out.println(list);
			
			return model;
			
			
		}
	 

	  
	  
}
