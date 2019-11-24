package com.lti.services;

import java.util.List;

import com.lti.model.User;

public interface UserService {

	public User addUser(User u);
	public void updateUser(User u);
	public User findById(int id);
	//public User findByEmail(String email);
	public List<User> findAllUsers();
	
	public User login(User u);
}
