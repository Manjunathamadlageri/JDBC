package com.ty;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class UpdateStudent 
{
	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			Statement statement = connection.createStatement();
			statement.executeUpdate("update student set name='dhanu' where id=114");
			connection.close(); 
			System.out.println("data updated");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
