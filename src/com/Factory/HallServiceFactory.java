package com.Factory;

import com.theatre.service.HallService;
import com.theatre.service.HallServiceImple;

public class HallServiceFactory {
	public static HallService hallService=null;
	static {
		HallService hallService = new HallServiceImple();
	}
	public HallService getHallService() {
		return hallService;
	}
}
