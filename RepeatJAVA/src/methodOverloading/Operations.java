package methodOverloading;

public class Operations 
{
	
	void add(int a, int b)
	{
		System.out.println("Addition: "+(a+b));
	}
	
	void add(int a, int b, int c)
	{
		System.out.println("Addition: "+(a+b+c));
	}
	
	float add(float a, int b)
	{
		return a+b;
	}
	
	String add (String a, String b)
	{
		return a+b;
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Operations o = new Operations();
		System.out.println(o.add(2.3f, 4));
		System.out.println(o.add("Ram", "sham"));
		o.add(1, 4);
		
		

	}

}
