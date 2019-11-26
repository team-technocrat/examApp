package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Questions;
import com.lti.repository.QuestionRepository;

@Service("questionService")
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionRepository repository;
	
	
	
	@Override
	@Transactional
	public Questions addQuestion(Questions q) {
		// TODO Auto-generated method stub
		return repository.addQuestion(q);
	}

	@Override
	@Transactional
	public Questions updateQuestion(Questions q) {
		// TODO Auto-generated method stub
		return repository.updateQuestion(q);
		
	}

	@Override
	public List<Questions> findAllQuestions()
	{

		return	repository.findAllQuestions();
	
	}
	
	@Override
	public Questions findQuestions(int question_id) {
		// TODO Auto-generated method stub
		
		return repository.findQuestions(question_id);
	}

	@Override
	@Transactional
	public void removeQuestion(Questions q) {
		// TODO Auto-generated method stub
		repository.removeQuestion(q);
		
	}

	
		public List<Questions> findAllQuestionsWithChoice() {
			return repository.findAllQuestionsWithChoice();
		
		}

		@Override
		public List<Questions> findWithTechnology(String technology_name) {
			// TODO Auto-generated method stub
			return repository.findWithTechnology(technology_name);
		}

		@Override
		public List<Questions> getCorrectAns(int question_id) {
			// TODO Auto-generated method stub
			return repository.getCorrectAns(question_id);
		}

		

		
	
	
	
	

}
