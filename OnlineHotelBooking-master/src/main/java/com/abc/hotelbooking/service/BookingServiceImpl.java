package com.abc.hotelbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.hotelbooking.entity.BookingTransactions;
import com.abc.hotelbooking.repository.BookingTransactionRepository;

@Service
public class BookingServiceImpl implements BookingService{
	@Autowired
	BookingTransactionRepository bookingRepository;
	
	@Override
	public List<BookingTransactions> getallBookingTransactions(){
		return bookingRepository.findAll();
	}
}
