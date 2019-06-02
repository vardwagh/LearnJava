package abstractionExample;

import java.util.Scanner;

public class Circle extends Shape
{
	int radius;
	final float pi =3.14f;
	
	
	public Circle() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Radius of a circle: ");
		radius = sc.nextInt();
	}


	void area() 
	{
		// TODO Auto-generated method stub
		float area= pi*radius*radius;
		System.out.println("Area of Circle = "+area);
		
	}
	
	void peri() 
	{
		// TODO Auto-generated method stub
		float peri=2*pi*radius;
		System.out.println("Pari of Circle = "+peri);
		
	}

}
