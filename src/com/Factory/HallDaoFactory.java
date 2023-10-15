package com.Factory;

import com.theatre.dao.HallDao;
import com.theatre.dao.HallDaoImple;

public class HallDaoFactory {
	private static HallDao hallDao = null;
	static {
		hallDao=new HallDaoImple();
	}
	public static HallDao getHallDao() {
		return hallDao;
	}
	
}
