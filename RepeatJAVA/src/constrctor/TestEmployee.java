package constrctor;

public class TestEmployee {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1,"vardhan", 100000);
		Employee e2 = new Employee(2,"Ram", 200000);
		Employee e3 =  new Employee(3,"Sham", 300000);
		
		e1.display();
		e2.display();
		e3.display();
		
		if(e1.salary>e2.salary&&e1.salary>e3.salary)
		{
			System.out.println(e1.name+" Has Highest Salary of "+e1.salary);
			
		}
		else if(e2.salary>e1.salary&&e2.salary>e3.salary)
		{
			System.out.println(e2.name+" Has Highest Salary of "+e2.salary);
		}
		else
		{
			System.out.println(e3.name+" Has Highest Salary of "+e3.salary);
		}
		

	}

}
