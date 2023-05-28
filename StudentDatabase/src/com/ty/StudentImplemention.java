package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentImplemention implements StudentInterface
{
 @Override
	public void savaStudent() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id");
	    int id = sc.nextInt();
	    System.out.println("Enter Name");
	    String name = sc.next();
	    System.out.println("Enter Age");
	    int age = sc.nextInt();
	    System.out.println("Enter Marks");
	    double marks = sc.nextDouble();
			
            try {
            	
			Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdatabase","root","root");
				PreparedStatement ps = connection.prepareStatement("insert into student values(?,?,?,?)");
				ps.setInt(1,id);
				ps.setString(2,name);
				ps.setInt(3,age);
				ps.setDouble(4,marks);
				ps.execute();
				connection.close();
				System.out.println("DATA SAVED");
			} 
            catch (ClassNotFoundException | SQLException e) 
            {
				
				e.printStackTrace();
			}
	}
	@Override
	public void deleteStudent() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			PreparedStatement preparedStatement = connection.prepareStatement("delete from student where id=?");
			preparedStatement.setInt(1, 101);
			connection.close();
			System.out.println("data deleted");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public void updateStudent() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			PreparedStatement preparedStatement = connection.prepareStatement("update student set name=? where id=?");
			preparedStatement.setString(1, "Standly");
			preparedStatement.setInt(2, 102);
			connection.close();
			System.out.println("data deleted");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public void getStudentByMarkes() 
	{
		
	}

	@Override
	public void getAllStudent() 
	{
		
	}

}
