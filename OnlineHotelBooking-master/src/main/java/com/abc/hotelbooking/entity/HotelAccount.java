package com.abc.hotelbooking.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class HotelAccount implements Comparable<HotelAccount> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hotelId;
	private String hotelName;
	private String hotelType;
	private String hotelLocation;
	private int hotelRent;
	private int NumberOfRooms;
	private int NumberOfRoomsBooked;
	private int userRating;
	@Lob
	@Column(name="feedback",length=512)
	private String feedback;
	private String status;
	public HotelAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HotelAccount(int hotelId, String hotelName, String hotelType, String hotelLocation, int hotelRent,
			int numberOfRooms, int numberOfRoomsBooked, int userRating, String feedback, String status) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelType = hotelType;
		this.hotelLocation = hotelLocation;
		this.hotelRent = hotelRent;
		NumberOfRooms = numberOfRooms;
		NumberOfRoomsBooked = numberOfRoomsBooked;
		this.userRating = userRating;
		this.feedback = feedback;
		this.status = status;
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
	public String getHotelLocation() {
		return hotelLocation;
	}
	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}
	public int getHotelRent() {
		return hotelRent;
	}
	public void setHotelRent(int hotelRent) {
		this.hotelRent = hotelRent;
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
	public int getUserRating() {
		return userRating;
	}
	public void setUserRating(int userRating) {
		this.userRating = userRating;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public int hashCode() {
		return Objects.hash(NumberOfRooms, NumberOfRoomsBooked, feedback, hotelId, hotelLocation, hotelName, hotelRent,
				hotelType, status, userRating);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HotelAccount other = (HotelAccount) obj;
		return NumberOfRooms == other.NumberOfRooms && NumberOfRoomsBooked == other.NumberOfRoomsBooked
				&& Objects.equals(feedback, other.feedback) && hotelId == other.hotelId
				&& Objects.equals(hotelLocation, other.hotelLocation) && Objects.equals(hotelName, other.hotelName)
				&& hotelRent == other.hotelRent && Objects.equals(hotelType, other.hotelType)
				&& Objects.equals(status, other.status) && userRating == other.userRating;
	}
	@Override
	public String toString() {
		return "HotelAccount [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelType=" + hotelType
				+ ", hotelLocation=" + hotelLocation + ", hotelRent=" + hotelRent + ", NumberOfRooms=" + NumberOfRooms
				+ ", NumberOfRoomsBooked=" + NumberOfRoomsBooked + ", userRating=" + userRating + ", feedback="
				+ feedback + ", status=" + status + "]";
	}
	@Override
	public int compareTo(HotelAccount o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
