package com.theatre.service;

import java.sql.Connection;
import java.sql.Statement;

import com.Factory.ConnectionFactory;
import com.Factory.CustomerDaoFactory;
import com.theatre.dao.CustomerDao;
import com.theatre.dto.Customer;

public class CustomerServiceImple implements CustomerService {

	@Override
	public String addCustomer(Customer customer) {
		String status ="";
		try {
			CustomerDao customerDao= CustomerDaoFactory.getCustomerDao();
			status = customerDao.add(customer);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Customer searchCustomer(String custId) {
		Customer customer =null;
		CustomerDao customerDao =CustomerDaoFactory.getCustomerDao();
		customer = customerDao.search(custId);
		return customer;
	}

}
