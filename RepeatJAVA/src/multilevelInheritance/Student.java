package multilevelInheritance;

import java.util.Scanner;

public class Student

{
	int rollNO;
	String name;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Roll no:");
		rollNO=sc.nextInt();
		System.out.println("Enter Student Name :");
		name=sc.next();
	}

}
