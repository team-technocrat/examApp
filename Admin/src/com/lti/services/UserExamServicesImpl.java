package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.User_Exam_Question;
import com.lti.repository.UserExamRepository;

@Service("userExamService")
public class UserExamServicesImpl implements UserExamServices {

	@Autowired
	UserExamRepository repository;
	
	
	@Override
	public User_Exam_Question addExam(User_Exam_Question u) {
		// TODO Auto-generated method stub
		return repository.addExam(u);
	}
	
	@Override
	public String getCorrectAnswer(int question_id)
	{
		return repository.getCorrectAnswer(question_id);
	}

}
