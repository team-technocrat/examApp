package com.lti.repository;

import java.util.List;

import com.lti.model.User;

public interface UserRepository {

	
	
	
	public User addUser(User u);
	public void updateUser(User u);
	public User findById(int id);
	public User findByEmail(String email);
	public List<User> findAllUsers();
}
