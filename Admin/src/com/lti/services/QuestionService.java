package com.lti.services;

import java.util.List;

import com.lti.model.Questions;

public interface QuestionService {
	
	public Questions addQuestion(Questions q);
	
	public List<Questions> findAllQuestions();
	
	public Questions findQuestions(int question_id);

	Questions updateQuestion(Questions q);

	public void removeQuestion(Questions q);
	
	public List<Questions> findAllQuestionsWithChoice();
}
