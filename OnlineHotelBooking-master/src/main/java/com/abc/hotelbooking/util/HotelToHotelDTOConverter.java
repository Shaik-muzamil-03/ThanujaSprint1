package com.abc.hotelbooking.util;

import com.abc.hotelbooking.dto.HotelAccountResponseDTOAdmin;
import com.abc.hotelbooking.dto.HotelAccountResponseDTOClient;
import com.abc.hotelbooking.entity.BookingTransactions;
import com.abc.hotelbooking.entity.HotelAccount;

public class HotelToHotelDTOConverter {
	
	public static HotelAccountResponseDTOClient doDTOClientConvertion(HotelAccount ha,BookingTransactions ba) {
		HotelAccountResponseDTOClient dtoForClient = new HotelAccountResponseDTOClient();
		
		dtoForClient.setDateOfJoining(ba.getStartDate());
		dtoForClient.setDateOfEnd(ba.getEndDate());
		dtoForClient.setHotelName(ha.getHotelName());
		dtoForClient.setTotalRentpaid(ha.getHotelRent());
		
		return dtoForClient;
	}
	
	public static HotelAccountResponseDTOAdmin doToAdminConverter(HotelAccount ha) {
		HotelAccountResponseDTOAdmin dtoForAdmnin = new HotelAccountResponseDTOAdmin();
		
		dtoForAdmnin.setHotelId(ha.getHotelId());
		dtoForAdmnin.setHotelName(ha.getHotelName());
		dtoForAdmnin.setHotelLocation(ha.getHotelLocation());
		dtoForAdmnin.setHotelType(ha.getHotelType());
		dtoForAdmnin.setNumberOfRooms(ha.getNumberOfRooms());
		dtoForAdmnin.setNumberOfRoomsBooked(ha.getNumberOfRoomsBooked());
		
		return dtoForAdmnin;
	}

}
