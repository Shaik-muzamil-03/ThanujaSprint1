package com.abc.hotelbooking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abc.hotelbooking.entity.BookingTransactions;

@Service
public interface BookingService {
	public List<BookingTransactions>getallBookingTransactions();

}
