package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Result {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "result_seq")
	@SequenceGenerator(sequenceName = "result_seq", name = "result_seq", allocationSize = 1)
	int result_id;
	
	@OneToOne
	@JoinColumn(name="user_id")
	User user;
	
	@OneToOne
	@JoinColumn(name="user_exam_id")
	User_Exam user_exam;
	
	int total_score;

	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Result(int result_id, User user, User_Exam user_exam, int total_score) {
		super();
		this.result_id = result_id;
		this.user = user;
		this.user_exam = user_exam;
		this.total_score = total_score;
	}

	public int getResult_id() {
		return result_id;
	}

	public void setResult_id(int result_id) {
		this.result_id = result_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User_Exam getUser_exam() {
		return user_exam;
	}

	public void setUser_exam(User_Exam user_exam) {
		this.user_exam = user_exam;
	}

	public int getTotal_score() {
		return total_score;
	}

	public void setTotal_score(int total_score) {
		this.total_score = total_score;
	}
	
	
	
}
