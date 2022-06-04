package com.abc.hotelbooking.dto;

import java.util.Objects;

public class RatingDTO {
	int hotelId;
	int rating;
	public RatingDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public int hashCode() {
		return Objects.hash(hotelId, rating);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RatingDTO other = (RatingDTO) obj;
		return hotelId == other.hotelId && rating == other.rating;
	}
	@Override
	public String toString() {
		return "RatingDTO [hotelId=" + hotelId + ", rating=" + rating + "]";
	}
	

}
