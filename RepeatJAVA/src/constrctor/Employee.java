package constrctor;

public class Employee 
{
	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary)
	{
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display()
	{
		System.out.println("Emp ID ="+id+" Name="+name+"  Salary="+salary);
	}

}
