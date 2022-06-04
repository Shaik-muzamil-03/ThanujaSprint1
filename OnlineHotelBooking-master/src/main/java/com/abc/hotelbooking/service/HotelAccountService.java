package com.abc.hotelbooking.service;

import java.util.List;

import com.abc.hotelbooking.entity.HotelAccount;
import com.abc.hotelbooking.exceptions.InvalidHotelNameException;
import com.abc.hotelbooking.exceptions.InvalidUserException;
import com.abc.hotelbooking.exceptions.NoSuchElementException;

public interface HotelAccountService {
	
	public String login(String userName,String password) throws InvalidUserException;
	
	public boolean logout(String username);
	
	public List<HotelAccount> getHotelBasedOnLocation(String hotelLocation);
	
	
	
	
	public boolean insertAccount(HotelAccount a);
	public List<HotelAccount> getAllHotels();
	
	public boolean getupdatehotelLocation(int hotelId,String hotelLocation) throws InvalidHotelNameException,NoSuchElementException;
	public HotelAccount saveHotel(HotelAccount hotelAccount);
	public String getFeedbacks(int id);
	public boolean setUserRating(int id,int num);
	public boolean setFeedback(int id,String feedback);
	 
	
	//public HotelAccount hotelAccount(String hotelName)throws InvalidHotelNameException;

}
