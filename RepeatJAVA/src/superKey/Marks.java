package superKey;

import java.util.Scanner;

public class Marks extends Student
{
	 int marks;
	 
	
	 
	 public Marks(int rollNO, String name, int marks) 
	 {
		super(rollNO, name);
		this.marks=marks;
	}



	void display()
	 {
		 System.out.println(rollNO+" "+name+" "+marks);
	 }
}
