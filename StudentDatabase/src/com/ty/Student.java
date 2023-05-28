package com.ty;
import java.util.Scanner;

public class Student 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		StudentInterface si = new StudentImplemention();
		while(true)
		{
			System.out.println("STUDENT DATABASE");
			System.out.println("1:savaStudent\n2;deleteStudent\n3:updateStudent\n4:getStudentByMarks\n5:getAllStudent");
			System.out.println("enter the choice 1 to 5");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1: si.savaStudent();    break;
			case 2:si.deleteStudent();   break;
			case 3:si.updateStudent();   break;
			case 4:si.getStudentByMarkes();break;
			case 5:si.getAllStudent();   break;
			}
		}
	}

}
