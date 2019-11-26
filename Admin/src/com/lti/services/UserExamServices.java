package com.lti.services;

import com.lti.model.User_Exam_Question;

public interface UserExamServices {
	
	public User_Exam_Question addExam(User_Exam_Question u);
	public String getCorrectAnswer(int question_id);

}
