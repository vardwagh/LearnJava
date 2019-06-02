package methodOverridingExample;

public class Employee 
{
	 int empId;
	 String name;
	 int salary;
	 
	public Employee(int empId, String name, int salary) 
	{
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	void display()
	{
		System.out.println(empId+" "+name+" "+salary);
	}
	
	void totalSalary(int allowance)
	{
		this.salary= salary+allowance;
		System.out.println("Total Salary Of Employee :"+salary);
	}

}
