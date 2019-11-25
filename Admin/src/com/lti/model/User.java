package com.lti.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Candidate_user")
public class User {
	@Id @GeneratedValue
	int user_id;
	String name;
	String email;
	String password;
	int mobile;
	LocalDate dob;
	String city;
	String state;
	String qualification;
	int yearOfCompletion;
	
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getYearOfCompletion() {
		return yearOfCompletion;
	}
	public void setYearOfCompletion(int yearOfCompletion) {
		this.yearOfCompletion = yearOfCompletion;
	}
	public User() {
		super();
	}
	public User(int user_id, String name, String email, String password, int mobile,LocalDate dob, String city,
			String state, String qualification, int yearOfCompletion) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		//this.dob = dob;
		this.city = city;
		this.state = state;
		this.qualification = qualification;
		this.yearOfCompletion = yearOfCompletion;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", mobile=" + mobile + ", dob=" + dob + ", city=" + city + ", state=" + state + ", qualification="
				+ qualification + ", yearOfCompletion=" + yearOfCompletion + "]";
	}
	
	}


