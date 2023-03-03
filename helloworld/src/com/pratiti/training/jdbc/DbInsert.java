package com.pratiti.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class DbInsert {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratitidb","root","6292");
			boolean b = true;
			while(b) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter product name : ");
				String productName = sc.nextLine();
				System.out.println("Enter product price : ");
				double productPrice = Double.parseDouble(sc.nextLine());
				System.out.println("Enter product quantity : ");
				int productQuantity = Integer.parseInt(sc.nextLine());
				
				st = conn.createStatement();
				
				String str = "insert into tb1_product(name,price,quantity) values('" + productName + "',"+productPrice + "," + productQuantity + ")";
				
				st.executeUpdate(str);
				
				System.out.println("Data successfully inserted");
				
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
