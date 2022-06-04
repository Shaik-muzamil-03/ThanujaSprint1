package com.abc.hotelbooking.dto;

import java.util.List;
import java.util.Objects;

public class HotelAccountResponseDTOAdmin {
	private int hotelId;
	private String hotelName;
	private String hotelType;
	private int NumberOfRooms;
	private int NumberOfRoomsBooked;
	private String hotelLocation;
	public HotelAccountResponseDTOAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HotelAccountResponseDTOAdmin(int hotelId, String hotelName, String hotelType, int numberOfRooms,
			int numberOfRoomsBooked, String hotelLocation) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelType = hotelType;
		NumberOfRooms = numberOfRooms;
		NumberOfRoomsBooked = numberOfRoomsBooked;
		this.hotelLocation = hotelLocation;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelType() {
		return hotelType;
	}
	public void setHotelType(String hotelType) {
		this.hotelType = hotelType;
	}
	public int getNumberOfRooms() {
		return NumberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		NumberOfRooms = numberOfRooms;
	}
	public int getNumberOfRoomsBooked() {
		return NumberOfRoomsBooked;
	}
	public void setNumberOfRoomsBooked(int numberOfRoomsBooked) {
		NumberOfRoomsBooked = numberOfRoomsBooked;
	}
	public String getHotelLocation() {
		return hotelLocation;
	}
	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}
	@Override
	public int hashCode() {
		return Objects.hash(NumberOfRooms, NumberOfRoomsBooked, hotelId, hotelLocation, hotelName, hotelType);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelAccountResponseDTOAdmin other = (HotelAccountResponseDTOAdmin) obj;
		return NumberOfRooms == other.NumberOfRooms && NumberOfRoomsBooked == other.NumberOfRoomsBooked
				&& hotelId == other.hotelId && Objects.equals(hotelLocation, other.hotelLocation)
				&& Objects.equals(hotelName, other.hotelName) && Objects.equals(hotelType, other.hotelType);
	}
	
	
	
	
	
		
}
