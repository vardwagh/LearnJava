package multilevelInheritance;

import java.util.Scanner;

public class Marks extends Student
{
	 int marks;
	 
	 void inputMarks()
	 {
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter Student Marks:");
			marks=sc.nextInt();
	 }
	 
	
}
