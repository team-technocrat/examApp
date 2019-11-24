package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
public class Admin {
	
	@Id
	int admin_id;
	String email;
	String password;
	
	
	public Admin() {
		super();
		
	}
	
	public Admin(String email, String password) {
		super();
		this.email = email;
		this.password = password;
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
	
	@Override
	public String toString() {
		return "Admin [email=" + email + ", password=" + password + "]";
	}
	
	

}
