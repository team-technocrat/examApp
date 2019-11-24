package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class User_Exam_Question
{   
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_exam_question_seq")
	@SequenceGenerator(sequenceName = "user_exam_question_seq", name = "user_exam_question_seq", allocationSize = 1)
	int user_exam_id;
	
	@OneToOne
	@JoinColumn(name="question_id")
	Questions question;
	
	String correct_answer;
	int score;
	String ans;
	
	public User_Exam_Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User_Exam_Question(int user_exam_id, Questions question, String correct_answer, int score, String ans) {
		super();
		this.user_exam_id = user_exam_id;
		this.question = question;
		this.correct_answer = correct_answer;
		this.score = score;
		this.ans = ans;
	}
	
	public int getUser_exam_id() {
		return user_exam_id;
	}
	public void setUser_exam_id(int user_exam_id) {
		this.user_exam_id = user_exam_id;
	}
	public Questions getQuestion() {
		return question;
	}
	public void setQuestion(Questions question) {
		this.question = question;
	}
	public String getCorrect_answer() {
		return correct_answer;
	}
	public void setCorrect_answer(String correct_answer) {
		this.correct_answer = correct_answer;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	
	
	
}
