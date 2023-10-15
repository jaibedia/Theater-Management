package com.Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnectionFactory {
	private static Connection con= null;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/theatremanagment","root","jaibedia");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return con;
	}
	public static void cleanUp() {
		try {
			con.close();
			System.out.println("Database connection close successfully...");
			System.out.println("Application close successfully...");
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
