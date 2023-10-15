package com.theatre.service;

import com.Factory.SeatDaoFactory;
import com.theatre.dao.SeatDao;

public class SeatServiceImple implements SeatService {

	@Override
	public void DisplayAvailableSeats() {
		SeatDao seatDao = SeatDaoFactory.getSeatDao();
		seatDao.availableSeat();
	}

}
