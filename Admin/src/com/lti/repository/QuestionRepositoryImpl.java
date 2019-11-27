package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Questions;

@Repository("questionRepository")
public class QuestionRepositoryImpl implements QuestionRepository {

	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public Questions addQuestion(Questions q) 
	{
		em.persist(q);
		return q;
	}

	@Override
	@Transactional
	public Questions updateQuestion(Questions q) 
	{
		em.merge(q);
		return q;	
	}

	@Override
	public List<Questions> findAllQuestions() 
	{
		String q1="select q from Questions q";
		javax.persistence.TypedQuery<Questions> query=em.createQuery(q1,Questions.class);
		List<Questions> l=query.getResultList();
		
	return l;

	}

	@Override
	public Questions findQuestions(int question_id) {
		// TODO Auto-generated method stub
		Questions q1 = em.find(Questions.class, new Integer(question_id));
		return q1;
	}

	@Override
	@Transactional
	public void removeQuestion(Questions q) {
		// TODO Auto-generated method stub
		q=em.merge(q);
		em.remove(q);
	}

	@Override
	public List<Questions> findAllQuestionsWithChoice() {
		// TODO Auto-generated method stub
		String q1="select q from Questions q";
		TypedQuery<Questions> query = em.createQuery(q1, Questions.class);
	    List<Questions> l = query.getResultList();
	
	return l;
	}

	@Override
	public List<Questions> findWithTechnology(String technology_name) {
		String q1 = "select q from Questions q where technolgy_name="+technology_name;
		TypedQuery<Questions> query = em.createQuery(q1, Questions.class);
		List<Questions> l = query.getResultList();

		return l;
	}

	@Override
	public List<Questions> getCorrectAns(int question_id) {
		String query = "select c.correct_ans from Choices c where c.question_id="+question_id;
		TypedQuery<Questions> list = em.createQuery(query,Questions.class);
		return list.getResultList();
	}
	


}
