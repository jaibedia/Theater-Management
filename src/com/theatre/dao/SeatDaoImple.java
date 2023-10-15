package com.theatre.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.Factory.ConnectionFactory;
import com.Factory.SqlConnectionFactory;

public class SeatDaoImple implements SeatDao {

	@Override
	public void availableSeat() {
		Connection con = SqlConnectionFactory.getConnection(); 
		try {
			Statement st = con.createStatement();
			st.executeQuery("select ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
