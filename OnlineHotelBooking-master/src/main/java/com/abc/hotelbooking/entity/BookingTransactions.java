package com.abc.hotelbooking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookingTransactions {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name = "bookingId")
	private int bookingId;
	@Column(nullable = false)
	private int hotelId;
	@Column(nullable = false)
	private int userId;
	@Column(nullable = false)
	private String startDate;
	@Column(nullable = false)
	private String endDate;
	public BookingTransactions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookingTransactions(int bookingId, int hotelId, int userId, String startDate, String endDate) {
		super();
		this.bookingId = bookingId;
		this.hotelId = hotelId;
		this.userId = userId;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	
	

}
