package com.abc.hotelbooking.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abc.hotelbooking.entity.HotelAccount;
import com.abc.hotelbooking.entity.User;
import com.abc.hotelbooking.exceptions.InvalidHotelNameException;
import com.abc.hotelbooking.exceptions.InvalidUserException;
import com.abc.hotelbooking.exceptions.NoSuchElementException;
import com.abc.hotelbooking.repository.AccountRepository;
import com.abc.hotelbooking.repository.HotelAccountRepository;
import com.abc.hotelbooking.sort.AccountLocationHighToLow;

@Service
public class HotelAccountServiceImpl implements HotelAccountService{
	
	@Autowired
	HotelAccountRepository hotelAccountRepository;
	AccountRepository accountRepository;
	@Override
	public String login(String userName, String password) throws InvalidUserException {
		// TODO Auto-generated method stub
		String role = hotelAccountRepository.verifyUser(userName, password);
		return role;
	}

	@Override
	public boolean logout(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<HotelAccount> getHotelBasedOnLocation(String hotelLocation) {


			List<HotelAccount> accounts = getAllHotels();
			//Collections.sort(accounts, new AccountLocationHighToLow());
			return accounts;
		}

	

	
	

	@Override
	public List<HotelAccount> getAllHotels() {
		return hotelAccountRepository.findAll();
	}

	

	@Override
	@Transactional
	public boolean getupdatehotelLocation(int hotelId,String hotelLocation)  throws InvalidHotelNameException, NoSuchElementException {
		
		try {
			User a = accountRepository.findById(hotelId).get();

			if (a != null) {
				// code to update balance;
				a.setUserAddress(hotelLocation);
				return true;
			}
			else {
				throw new NoSuchElementException();
			}
			
		} catch (java.util.NoSuchElementException e) {
			System.out.println("---->>2 inside CATCH block of ServiceImpl class ");
			throw new InvalidHotelNameException(hotelId, e.getMessage());
		}
	
	}

	@Override
	public HotelAccount saveHotel(HotelAccount hotelAccount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertAccount(HotelAccount a) {
		HotelAccount savedObject = hotelAccountRepository.save(a);

		return savedObject != null ? true : false;
	}

	@Override
	public String getFeedbacks(int id) {
		List<HotelAccount> hotels = hotelAccountRepository.findAll();
		String feedback = "";
		for(HotelAccount hotel:hotels) {
			if(hotel.getHotelId()==id) 
				feedback =  hotel.getFeedback();
	
	}
		return feedback;

	
	}

	@Override
	public boolean setUserRating(int id,int num) {
		HotelAccount hotel = hotelAccountRepository.getById(id);
		hotel.setUserRating(num);
		hotelAccountRepository.save(hotel);
		
		
		return true;
	}

	@Override
	public boolean setFeedback(int id, String feedback) {
		HotelAccount h = hotelAccountRepository.getById(id);
		h.setFeedback(feedback);
		hotelAccountRepository.save(h);
		return true;
	}
}
	


