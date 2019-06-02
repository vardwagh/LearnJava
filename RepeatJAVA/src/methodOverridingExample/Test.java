package methodOverridingExample;

public class Test {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Employee e = new Manager(101, "Vardhan", 10000, 5);
		e.totalSalary(1000);
		
		Employee e2 = new Hr(102, "Vardhan", 10000, 10);
		
		e2.totalSalary(1000);
	}

}
