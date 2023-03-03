package com.pratiti.traning.practice;

import java.io.*;
import java.sql.*;
class testing
{
	public static void main(String args[])
	{
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver"); 
	conn=DriverManager.getConnection("jdbc:mysql://localhost/exp11","root","6292");  
	if(conn==null)
	System.out.println("connection failed");
	else
	{
	System.out.println("connection successful");
	stmt=conn.createStatement();
	rs=stmt.executeQuery("select * from details");
	while(rs.next())
	{
	System.out.println("ID : "+rs.getInt(1)+" NAME : "+rs.getString(2)+" AGE : "+rs.getInt(3));
	}
conn.close();
}
}
	catch(Exception e)
	{
	System.out.println(e);
	}
}
}

//C:\Program Files\Java\jdk-16.0.1\bin
//C:\Program Files\Java\jdk1.8.0_202\bin
//cmd to run prog
//javac testing.java
//java -cp .;C:\myWebProject\mysql-connector-java-8.0.25\mysql-connector-java-8.0.25.jar testing