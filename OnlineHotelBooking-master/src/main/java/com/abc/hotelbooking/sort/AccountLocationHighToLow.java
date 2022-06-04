package com.abc.hotelbooking.sort;

import com.abc.hotelbooking.entity.HotelAccount;

public class AccountLocationHighToLow implements Comparable<HotelAccount> {
	
	@Override
	public int compareTo(HotelAccount o) {
		// TODO Auto-generated method stub
		return  o.getHotelId();
	}

}
