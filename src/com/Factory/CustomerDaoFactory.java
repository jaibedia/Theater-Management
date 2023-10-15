package com.Factory;

import com.theatre.dao.CustomerDao;
import com.theatre.dao.CustomerDaoImple;

public class CustomerDaoFactory {
	private static CustomerDao customerDao=null;
	static {
		customerDao = new CustomerDaoImple();
	}
	public static CustomerDao getCustomerDao() {
		return customerDao;
	}
}
