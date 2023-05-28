package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class UpdateSal 
{
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter salary");
		double salary= scan.nextDouble();
		System.out.println("Enter designation");
		String designation=scan.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/trainerdetails","root","root");
			PreparedStatement preparedStatement= connection.prepareStatement("update trainer set salary=? where degnation=?");
			preparedStatement.setDouble(1, salary);
			preparedStatement.setString(2, designation);
			preparedStatement.execute();
			connection.close();
			
			System.out.println("---------------------------------");
			System.out.println("data updated");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
