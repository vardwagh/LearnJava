package staticKey;

public class Students
{
	int rollNo;
	String name;
	static String clgName="SITS";
	

	public Students(int rollNo, String name) 
	{
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	void display()
	{
		System.out.println(rollNo+" "+name+" "+clgName);
	}
	
	static void changeClgName()
	{
		clgName="SCOE";
	}
	
	public static void main(String[] args) 
	{
		Students s1 =  new Students(101, "vardhan");
		Students s2 =  new Students(102, "ram");
		
		s1.display();
		s2.display();
		
		Students.changeClgName();
		
		s1.display();
		s2.display();
	}
}
