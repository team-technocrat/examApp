package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Exam;

@Repository("examRepository")
public class ExamRepositoryImpl implements ExamRepository {

	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public Exam addExam(Exam exam) {
		// TODO Auto-generated method stub
		em.persist(exam);
		return exam;
	}

	@Override
	public Exam findExam(int exam_id) {
		// TODO Auto-generated method stub
		Exam exam1 = em.find(Exam.class, new Integer(exam_id)); 
		return exam1;
		
	}

}
