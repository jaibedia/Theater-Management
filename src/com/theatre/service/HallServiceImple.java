package com.theatre.service;

import com.Factory.HallDaoFactory;
import com.theatre.dao.HallDao;

public class HallServiceImple implements HallService {

	@Override
	public void displayDetails() {
			HallDao hallDao = HallDaoFactory.getHallDao();
			hallDao.details();
	}

}
