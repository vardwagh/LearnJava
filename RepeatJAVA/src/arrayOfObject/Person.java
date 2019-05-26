package arrayOfObject;

import java.util.Scanner;

public class Person 
{
	int age;
	String name;
	
	/*Person()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name :");
		name=sc.next();
		System.out.println("Enter Age :");
		age=sc.nextInt();
	}*/
	
	Person(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	
	void display()
	{
		System.out.println("Name is "+this.name+" Age is "+this.age);
	}

}
