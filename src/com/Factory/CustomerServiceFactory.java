package com.Factory;

import com.theatre.service.CustomerService;
import com.theatre.service.CustomerServiceImple;

public class CustomerServiceFactory {
	private static CustomerService customerService=null;
	
	static {
		customerService = new CustomerServiceImple();
	}
	
	public static CustomerService getCustomerService() {
		return customerService;
	}
}
