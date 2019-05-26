package heirarchicalInheritance;

import java.util.Scanner;

public class Student extends Person
{
	int rollNo;
	int marks;
	
	void inputStudent()
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Student roll NO :");
		rollNo=sc.nextInt();
		System.out.println("Enter Student Marks :");
		marks=sc.nextInt();
	}
	
	void displayStudent()
	{
		System.out.println(rollNo+" "+name+" "+age+" "+marks);
	}

}
