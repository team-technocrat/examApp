package com.lti.repository;

import com.lti.model.Exam;

public interface ExamRepository {
	
	public Exam addExam(Exam exam);
	
	public Exam findExam(int exam_id);

}
