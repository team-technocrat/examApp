package com.lti.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Exam;
import com.lti.model.Levels;
import com.lti.services.ExamService;
import com.lti.services.LevelsService;
import com.lti.util.*;

@Controller
@SessionAttributes("exams")
public class ExamController {
	
	@Autowired
	ExamService service;
	
	@Autowired
	LevelsService levelService;
	
	@RequestMapping(value="addExam" , method = RequestMethod.POST)
	public ModelAndView addExam(@RequestParam int level_id , String appearing_date , String status , String remarks , int no_of_questions , int passing_percentage)
	{
		Levels level = levelService.findLevels(level_id);
		
		Exam exam = new Exam();
		exam.setAppearing_date(DateWorker.formatDate(appearing_date));
		exam.setStatus(status);
		exam.setRemarks(remarks);
		exam.setNo_of_questions(no_of_questions);
		exam.setPassing_percentage(passing_percentage);
		
		System.out.println(exam);
		
		Exam e = service.addExam(exam);
		
		System.out.println(e);
		ModelAndView model=null;
		if(e==null)
		{
			model = new  ModelAndView("addFailed");
		}
		else
		{
			model = new  ModelAndView("addSuccess");
			model.addObject("exams",e);
		}
		return model;
	}

}
