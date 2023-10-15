package com.Factory;

import com.theatre.dao.SeatDao;
import com.theatre.dao.SeatDaoImple;

public class SeatDaoFactory {
	private static SeatDao seatDao = null;
	static {
		seatDao = new SeatDaoImple();
	}
	public static SeatDao getSeatDao() {
		return seatDao;
	}
}
