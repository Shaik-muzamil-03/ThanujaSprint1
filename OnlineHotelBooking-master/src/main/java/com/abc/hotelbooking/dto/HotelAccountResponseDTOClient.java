package com.abc.hotelbooking.dto;

import java.util.Objects;

public class HotelAccountResponseDTOClient {
	

	private String hotelName;
	private int totalRentpaid;
	private String dateOfJoining;
	private String dateOfEnd;
	public String getDateOfEnd() {
		return dateOfEnd;
	}
	public void setDateOfEnd(String dateOfEnd) {
		this.dateOfEnd = dateOfEnd;
	}
	public HotelAccountResponseDTOClient(String dateOfEnd) {
		super();
		this.dateOfEnd = dateOfEnd;
	}
	public HotelAccountResponseDTOClient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HotelAccountResponseDTOClient(String hotelName, int totalRentpaid, String dateOfJoining) {
		super();
		this.hotelName = hotelName;
		this.totalRentpaid = totalRentpaid;
		this.dateOfJoining = dateOfJoining;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getTotalRentpaid() {
		return totalRentpaid;
	}
	public void setTotalRentpaid(int totalRentpaid) {
		this.totalRentpaid = totalRentpaid;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dateOfJoining, hotelName, totalRentpaid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelAccountResponseDTOClient other = (HotelAccountResponseDTOClient) obj;
		return dateOfJoining == other.dateOfJoining && Objects.equals(hotelName, other.hotelName)
				&& totalRentpaid == other.totalRentpaid;
	}
	
}
