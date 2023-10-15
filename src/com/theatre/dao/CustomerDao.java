package com.theatre.dao;

import com.theatre.dto.Customer;

public interface CustomerDao {
	public String add(Customer customer);
	public Customer search(String custId);
}
