package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Choices;
import com.lti.model.Questions;


@Repository("ChoicesRepository")
public class ChoiceRepositoryImpl implements ChoiceRepository 
{
	
	@PersistenceContext
	EntityManager em;

	@Override
	public List<Choices> findAllChoices() {
		String c1="select c from Choices c";
		javax.persistence.TypedQuery<Choices> query=em.createQuery(c1,Choices.class);
		List<Choices> l=query.getResultList();
		
		for(Choices b:l)
		{
			System.out.println("\n\n----------"+b);
		}
			/*System.out.println("in dao");
			String ql = " from Users";
			Query q = em.createQuery(ql);
			return q.getResultList();*/
		
	return l;

	}

	@Override
	@Transactional
	public Choices addChoices(Choices c) {
		// TODO Auto-generated method stub
		em.persist(c);
		return c;
	}
	
	
}
