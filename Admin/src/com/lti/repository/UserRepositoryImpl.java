package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.User;
@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {
    @PersistenceContext
    EntityManager em;
    
    @Transactional
	public User addUser(User u) {
	em.persist(u);
	return u;
	}

	@Override
	public void updateUser( User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
@Transactional
	@Override
	public User findByEmail(String email) 
	{
		String q="select b from User b where b.email=?1";
		TypedQuery<User> query=em.createQuery(q,User.class);
		query.setParameter(1, email);
		User u=query.getSingleResult();
		return u;	
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
