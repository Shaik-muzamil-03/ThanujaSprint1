package com.abc.hotelbooking.repository;

import org.springframework.stereotype.Repository;

import com.abc.hotelbooking.exceptions.InvalidUserException;

@Repository
public interface CustomHotelAccountRepository {
	public String verifyUser(String username,String password)throws InvalidUserException;

}
