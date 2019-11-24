package com.lti.services;

import com.lti.model.Exam;

public interface ExamService  {

	public Exam addExam(Exam exam);
	
	public Exam findExam(int exam_id);

}
