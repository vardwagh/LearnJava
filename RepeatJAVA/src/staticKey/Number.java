package staticKey;

public class Number 
{	
	
	static float pi=3.14f;
	
	static float area(int radius)
	{
		return pi*radius*radius;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
				
		System.out.println("Area of circle ="+Number.area(10));
	}

}
