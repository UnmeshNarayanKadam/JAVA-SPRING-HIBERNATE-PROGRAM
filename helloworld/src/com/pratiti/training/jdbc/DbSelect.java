package com.pratiti.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class DbSelect {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratitidb","root","6292");
			
			st=conn.prepareStatement("select * from tb1_product");
			ResultSet rs=st.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getInt(4));
			}
			
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



























