package com.abc.hotelbooking.exceptions;

public class InvalidHotelNameException extends Exception {
	int reqHotelId;
	String errorMsg;
	public InvalidHotelNameException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InvalidHotelNameException(int reqHotelId, String errorMsg) {
		super();
		this.reqHotelId = reqHotelId;
		this.errorMsg = errorMsg;
	}
	public int getReqHotelName() {
		return reqHotelId;
	}
	public void setReqHotelName(int reqHotelName) {
		this.reqHotelId = reqHotelName;
	}
	public String getErrorMsg() {
		return errorMsg+"for hotelid"+this.reqHotelId;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	

}
