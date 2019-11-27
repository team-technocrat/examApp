package com.lti.repository;

import java.util.List;

import com.lti.model.Questions;

public interface QuestionRepository {
	
	public Questions addQuestion(Questions q);

	public List<Questions> findAllQuestions();
	
	public Questions findQuestions(int question_id);
	
	public Questions updateQuestion(Questions q);
	
	public void removeQuestion(Questions q);
	
	public List<Questions> findAllQuestionsWithChoice();
	
	public List<Questions> findWithTechnology(String technology_name);
	
	public List<Questions> getCorrectAns(int question_id);
	

}
