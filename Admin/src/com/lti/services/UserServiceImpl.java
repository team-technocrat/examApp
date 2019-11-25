package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.User;
import com.lti.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository repository;
	
	@Transactional
	@Override
	public User addUser(User u) {
		// TODO Auto-generated method stub
		return repository.addUser(u);
	}

	@Override
	public void updateUser(User u) {
		// TODO Auto-generated method stub
		repository.updateUser(u);
		
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		User u=repository.findById(id);
		return u;
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public User login(User u) {
		User userToBeReturned=null;
		User uDB= repository.findByEmail(u.getEmail());
		
		if(uDB==null)
		{
			
		}
		else if(uDB.getEmail().equals(u.getEmail())&&(uDB.getPassword().equals(u.getPassword())))
		{
			userToBeReturned = uDB;
		}
		else
		{
			
		}
		return userToBeReturned;
	}

}
