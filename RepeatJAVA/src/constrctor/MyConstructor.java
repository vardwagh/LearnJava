package constrctor;

public class MyConstructor 
{
	int a;
	int b;
	int c;
	

	public MyConstructor()
	{
		System.out.println("Default constructor");
	}

	public MyConstructor(int a) {
		this();
		this.a = a;
	}

	public MyConstructor(int b, int c) 
	{
		this(1);
		this.b = b;
		this.c = c;
	}
	
	void display()
	{
		System.out.println(a+" "+b+" "+c);
	}
	
	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		MyConstructor m1 = new MyConstructor();
		MyConstructor m = new MyConstructor(4, 5);
		m.display();

	}

}
