package com.abc.hotelbooking.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.hotelbooking.entity.BookingTransactions;
import com.abc.hotelbooking.service.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingTransactionRestController {
	@Autowired
	BookingService bookingservice;

	public BookingTransactionRestController() {
		super();
		
		System.out.println("-----Inside Booking Constructor");
	}
	
	@GetMapping("/allbookings")
	public List<BookingTransactions> getallBookingTransactions()
	{
		return bookingservice.getallBookingTransactions();
	}
	
}
