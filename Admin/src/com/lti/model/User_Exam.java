package com.lti.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class User_Exam 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_exam_seq")
	@SequenceGenerator(sequenceName = "user_exam_seq", name = "user_exam_seq", allocationSize = 1)
	int user_exam_ok_id;
	
	@OneToOne
	@JoinColumn(name="user_id")
	User user;
	
	@OneToOne
	@JoinColumn(name="exam_id")
	Exam exam;
	
	LocalDate appeared_date;
	String status;
	String remark;
	
	public User_Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User_Exam(int user_exam_ok_id, User user, Exam exam, LocalDate appeared_date, String status, String remark) {
		super();
		this.user_exam_ok_id = user_exam_ok_id;
		this.user = user;
		this.exam = exam;
		this.appeared_date = appeared_date;
		this.status = status;
		this.remark = remark;
	}

	public int getUser_exam_ok_id() {
		return user_exam_ok_id;
	}

	public void setUser_exam_ok_id(int user_exam_ok_id) {
		this.user_exam_ok_id = user_exam_ok_id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public LocalDate getAppeared_date() {
		return appeared_date;
	}

	public void setAppeared_date(LocalDate appeared_date) {
		this.appeared_date = appeared_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "User_Exam [user_exam_ok_id=" + user_exam_ok_id + ", user=" + user + ", exam=" + exam
				+ ", appeared_date=" + appeared_date + ", status=" + status + ", remark=" + remark + "]";
	}
	
	

}
