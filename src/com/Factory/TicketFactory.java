package com.Factory;

import com.theatre.dao.TicketDao;
import com.theatre.dao.TicketDaoImple;

public class TicketFactory {
	private static TicketDao ticketDao = null;
	static {
		ticketDao = new TicketDaoImple();
	}
	
	public static TicketDao getTicketDao() {
		return ticketDao;
	}
}
