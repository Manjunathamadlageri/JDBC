package com.ty;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class GetDetailsM 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/trainerdetails","root","root");
			PreparedStatement preparedStatement= connection.prepareStatement("select * from trainer where name like 'r%' and age>=23");
			ResultSet resultset= preparedStatement.executeQuery();
			while (resultset.next()){
				System.out.println("the trainer id is: "+resultset.getInt(1));
				System.out.println("the trainer name is: "+resultset.getString(2));
				System.out.println("the trainer age is: "+resultset.getInt(3));
				System.out.println("the trainer designation is: "+resultset.getString(4));
				System.out.println("the trainer subject is: "+resultset.getString(5));
				System.out.println("the trainer salary is: "+ resultset.getDouble(6));
				
			//	connection.close();
		    	System.out.println("---------------------------------------");
				//System.out.println("data retrieved");
			}
		//	preparedStatement.execute();
			connection.close();
			System.out.println("data retrieved");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
