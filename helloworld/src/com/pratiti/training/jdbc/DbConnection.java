package com.pratiti.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			//step 1: Loading the jdbc Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step 2: Connecting the database
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratitidb","root","6292");
			System.out.println("Got connected");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {conn.close();} catch (Exception e) {}
		}
	}

}
