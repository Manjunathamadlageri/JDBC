   package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Trainer 
{
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter trainer Id");
		int id= scan.nextInt();
		System.out.println("Enter trainer name");
		String name=scan.next();
		System.out.println("Enter trainer age");
		int age= scan.nextInt();
		System.out.println("Enter trainer designetion");
		String designation= scan.next();
		System.out.println("Enter trainer subject");
		String subject= scan.next();
		System.out.println("Enter trainer salary");
		double salary=scan.nextDouble();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/trainer_details","root","root");
			PreparedStatement preparedStatement= connection.prepareStatement("insert into trainer values(?,?,?,?,?,?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setInt(3, age);
			preparedStatement.setString(4, designation);
			preparedStatement.setString(5, subject);
			preparedStatement.setDouble(6, salary);
			preparedStatement.execute();
			connection.close();
		System.out.println("------------------------------------");	
			System.out.println("data saved");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
