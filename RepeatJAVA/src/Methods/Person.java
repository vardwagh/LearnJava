package Methods;

import java.util.Scanner;

public class Person
{
	int age;
	String name;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		age = sc.nextInt();
		System.out.println("Enter Name : ");
		name= sc.next();
		sc.close();
	}
	
	void display()
	{
		System.out.println("Name= "+name+" Age ="+age);
	}

}
