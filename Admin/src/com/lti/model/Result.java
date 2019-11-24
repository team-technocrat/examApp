package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Result {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "result_seq")
	@SequenceGenerator(sequenceName = "result_seq", name = "result_seq", allocationSize = 1)
	
	int result_id;
	int user_id;
	int user_exam_id;
	int total_score;
	
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Result(int result_id, int user_id, int user_exam_id, int total_score) {
		super();
		this.result_id = result_id;
		this.user_id = user_id;
		this.user_exam_id = user_exam_id;
		this.total_score = total_score;
	}

	
	
	public int getResult_id() {
		return result_id;
	}

	public void setResult_id(int result_id) {
		this.result_id = result_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getUser_exam_id() {
		return user_exam_id;
	}

	public void setUser_exam_id(int user_exam_id) {
		this.user_exam_id = user_exam_id;
	}

	public int getTotal_score() {
		return total_score;
	}

	public void setTotal_score(int total_score) {
		this.total_score = total_score;
	}

	@Override
	public String toString() {
		return "Result [result_id=" + result_id + ", user_id=" + user_id + ", user_exam_id=" + user_exam_id
				+ ", total_score=" + total_score + "]";
	}
	
	
	
}
