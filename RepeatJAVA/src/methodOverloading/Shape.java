package methodOverloading;

public class Shape {

	
	
	void area(int length, int bredth)
	{
		System.out.println("Area of Rectangle is ="+(length*bredth));
	}
	
	float area(float radius)	
	{
		return 3.14f*radius*radius;
	}
	
	int area(int side)
	{
		return side*side;
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Shape s = new Shape();
		
	
		System.out.println("Area of circle :"+s.area(10.5f));
		System.out.println("Area of square :"+s.area(10));
		s.area(12, 10);

	}

}
