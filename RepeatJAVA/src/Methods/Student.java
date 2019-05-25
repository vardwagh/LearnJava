package Methods;

public class Student 
{
	int rollNO;
	String name;
	
	void inputwiththis(int rollNO, String name)
	{
		this.rollNO=rollNO;
		this.name=name;
	}
	
//	void input(int a, String b)
//	{
//		rollNO=a;
//		name=b;
//	}
	void display()
	{
		System.out.println("Roll no ="+rollNO);
		System.out.println("Name ="+name);
	}
	
	
	public static void main(String[] args)
	{
		
		Student s = new Student();
		Student s2 = new Student();
		
		s.rollNO=101;
		s.name="Vardhan";
		
		System.out.println("Roll no ="+s.rollNO);
		System.out.println("Name ="+s.name);
		
		//s2.input(1, "Vardhan");
		s2.inputwiththis(1, "vardhan");
		s2.display();
	}

}
