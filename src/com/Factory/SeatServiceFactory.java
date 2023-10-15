package com.Factory;

import com.theatre.service.SeatService;
import com.theatre.service.SeatServiceImple;

public class SeatServiceFactory {
	private static SeatService seatService = null;
	static {
		seatService = new SeatServiceImple();
	}
	
	public static SeatService getSeatService() {
		return seatService;
	}
}
