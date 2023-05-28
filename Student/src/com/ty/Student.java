package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			Statement Statement= connection.createStatement();
			Statement.execute("insert into student values(111, 'mc stan', 22)");
			Statement.execute("insert into student values(112, 'standly', 27)");
			Statement.execute("insert into student values(113, 'pavan', 23)");
			Statement.execute("insert into student values(114,  'ram', 25)");

			connection.close();
			System.out.println("data saved");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
} 
