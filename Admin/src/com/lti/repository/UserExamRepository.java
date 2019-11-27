package com.lti.repository;

import java.util.List;

import com.lti.model.Choices;
import com.lti.model.Exam;
import com.lti.model.Questions;
import com.lti.model.User_Exam_Question;

public interface UserExamRepository {
	
	public User_Exam_Question addExam(User_Exam_Question u);
	
	public String getCorrectAnswer(int question_id);

}
