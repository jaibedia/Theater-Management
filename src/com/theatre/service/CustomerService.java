package com.theatre.service;

import com.theatre.dto.Customer;

public interface CustomerService {
	public String addCustomer(Customer customer);
	public Customer searchCustomer(String custId);
	
}
