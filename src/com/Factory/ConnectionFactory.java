package com.Factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private static Connection con = null;
	static{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","jaibedia");
			
		} catch (Exception e) {
			e.getStackTrace();
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
