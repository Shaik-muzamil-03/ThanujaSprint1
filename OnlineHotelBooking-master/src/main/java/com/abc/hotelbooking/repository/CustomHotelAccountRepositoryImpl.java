package com.abc.hotelbooking.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.abc.hotelbooking.exceptions.InvalidUserException;

public class CustomHotelAccountRepositoryImpl implements CustomHotelAccountRepository{
	@Autowired
	EntityManager jpa; // Spring Data JPA supprot of Entity Manager
	
	@Override
	public String verifyUser(String username, String password) throws InvalidUserException{
		
		Session spring = jpa.unwrap(Session.class);
		
		String query = "select u.role from User u where u.userName =:enteredUsername and u.password=:enteredPassword";
		
		Query<String>  q = spring.createQuery(query);
		q.setParameter("enteredUsername", username);
		q.setParameter("enteredPassword", password);
		
		List<String> output =  q.getResultList();
		
		if(output.size()!=0)
		{
			return output.get(0); // role of that user 
		}else
		{
			throw new InvalidUserException(username,password);
		}
		
		
	}

}
