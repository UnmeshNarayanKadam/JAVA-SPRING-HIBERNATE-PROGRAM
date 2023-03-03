package com.pratiti.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbCreateTable {
	public static void main(String[] args) {
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratitidb","root","6292");
			Statement st = conn.createStatement();
			String str = "create table tb1_product(id int primary key auto_increment , name varchar(20) , price double,quantity int)";
			st.execute(str);
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
