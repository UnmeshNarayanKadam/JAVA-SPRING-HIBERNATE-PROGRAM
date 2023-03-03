package com.pratiti.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class DbImprovedVersionOfInsert {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement st = null;
		PreparedStatement ps=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratitidb","root","6292");
			
			String sql = "Insert into tb1_product(name,price,quantity) values(?,?,?)";
			st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			boolean b = true;
			while(b) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter product name : ");
				String productName = sc.nextLine();
				System.out.println("Enter product price : ");
				double productPrice = Double.parseDouble(sc.nextLine());
				System.out.println("Enter product quantity : ");
				int productQuantity = Integer.parseInt(sc.nextLine());
				
				st.setString(1, productName);
				st.setDouble(2, productPrice);
				st.setInt(3, productQuantity);
				
				st.executeUpdate();
				
				System.out.println("Record inserted");
				
				ResultSet rs = st.getGeneratedKeys();

				if (rs.next()) {
				    int id = rs.getInt(1);
				    System.out.println("Inserted ID - " + id);
				}
				System.out.println("Record Id : ");
				
				System.out.println("Do you want to continue(Y/N)");
				String z = sc.nextLine();
				if(z.equals("N")) {
					b = false;
				}
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
