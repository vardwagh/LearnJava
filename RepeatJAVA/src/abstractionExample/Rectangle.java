package abstractionExample;

import java.util.Scanner;

public class Rectangle extends Shape
{

	int length;
	int bredth;
	
	public Rectangle() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Length of a Rectangle: ");
		length = sc.nextInt();
		System.out.println("ENter Bredth of a Rectangle: ");
		bredth = sc.nextInt();
	}


	void area() 
	{
		// TODO Auto-generated method stub
		int area = length*bredth;
		System.out.println("Area of Rectangle ="+area);
		
	}

	
	void peri() 
	{
		// TODO Auto-generated method stub
		int peri = 2*(length+bredth);
		System.out.println("Area of Rectangle ="+peri);
		
	}

}
