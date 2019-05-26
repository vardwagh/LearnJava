package heirarchicalInheritance;

import java.util.Scanner;

public class Employee extends Person
{
	int empID;
	int salary;
	
	void inputEmployee()
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Employee ID :");
		empID=sc.nextInt();
		System.out.println("Enter Employee Salary :");
		salary=sc.nextInt();
	}
	
	void displayEmployee()
	{
		System.out.println(empID+" "+name+" "+age+" "+salary);
	}

}
