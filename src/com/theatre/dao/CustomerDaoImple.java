package com.theatre.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.Factory.ConnectionFactory;
import com.theatre.dto.Customer;

public class CustomerDaoImple implements CustomerDao {

	@Override
	public String add(Customer customer) {
		String status="";
		try {
			Connection con = ConnectionFactory.getConnection();
			Statement st = con.createStatement();
			Customer cust = search(customer.getcId());
			if(cust==null) {
				int rowCount = st.executeUpdate("insert into customers values('"+customer.getcId()+
							"','"+customer.getcName()+"','"+customer.getcAge()+"','"+
							customer.getGender()+"','"+customer.getMobNumber()+"','"+customer.getAddress()+"')");
				if(rowCount==1) {
					status = "Customer inserted successfully..";
				}else {
					status = "customer insertion failure...";
				}
			}else {
				status = "Customer already exist..";
			}
			
		} catch (Exception e) {
			status = "customer insertion failure...";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Customer search(String custId) {
		Customer customer=null;
		try {
			Connection con = ConnectionFactory.getConnection();
			Statement st = con.createStatement();
			ResultSet rs =st.executeQuery("select * from customers where cid='"+custId+"'");
			boolean b=rs.next();
			if(b) {
				customer =new Customer();
				customer.setcId(rs.getString("CID"));
				customer.setcName(rs.getString("CNAME"));
				customer.setcAge(rs.getString("CAGE"));
				customer.setGender(rs.getString("CGENDER"));
				customer.setMobNumber(rs.getString("CMOBILE"));
				customer.setAddress(rs.getString("CADDRESS"));
			}else {
				customer = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return customer;
	}

}
