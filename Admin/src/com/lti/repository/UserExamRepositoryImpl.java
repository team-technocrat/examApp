package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.model.Choices;
import com.lti.model.Questions;
import com.lti.model.User_Exam_Question;

@Repository("userExamRepository")
public class UserExamRepositoryImpl implements UserExamRepository {

	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public User_Exam_Question addExam(User_Exam_Question u) {
		// TODO Auto-generated method stub
		em.persist(u);
		return u;
	}

	@Transactional
	public String getCorrectAnswer(int question_id)
	{
		String query = "select c from Choices c where c.question=( Select q from Questions q where q.question_id=?1)";
		
		TypedQuery<Choices> q = em.createQuery(query,Choices.class);
		q.setParameter(1, question_id);
		String ans = q.getSingleResult().getCorrect_ans();
		return ans;
		
	}

}
