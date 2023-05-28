package com.ty;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class GetDataM 
{		//get student details who's name starts with m and age above 21
	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			Statement statement= connection.createStatement();
			ResultSet resultset= statement.executeQuery("select * from student where name like '%m%' and age >21");
			while (resultset.next()){
				System.out.println("the student id is: "+resultset.getInt(1));
				System.out.println("the student name is: "+resultset.getString(2));
				System.out.println("the student age is: "+resultset.getInt(3));
			}
			connection.close();
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}

   