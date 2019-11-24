package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Exam;
import com.lti.repository.ExamRepository;

@Service("examService")
public class ExamServiceImpl implements ExamService {

	@Autowired
	ExamRepository repository;
	
	@Override
	public Exam addExam(Exam exam) {
		// TODO Auto-generated method stub
		return repository.addExam(exam);
	}

	@Override
	public Exam findExam(int exam_id) {
		// TODO Auto-generated method stub
		return repository.findExam(exam_id);
	}

}
