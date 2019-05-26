package heirarchicalInheritance;

import java.util.Scanner;

public class Person 
{
	int age;
	String name;
	
	void inputPerson()
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Name :");
		name=sc.next();
		System.out.println("Enter Age :");
		age=sc.nextInt();
	}

}
