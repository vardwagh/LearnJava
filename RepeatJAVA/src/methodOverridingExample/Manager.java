package methodOverridingExample;

public class Manager extends Employee
{	
	int noOfProjects;

	public Manager(int empId, String name, int salary, int noOfProjects)
	{
		super(empId, name, salary);
		this.noOfProjects=noOfProjects;
		// TODO Auto-generated constructor stub
	}
	void totalSalary(int bonusPerProject)
	{
		super.display();
		this.salary= salary+(noOfProjects*bonusPerProject);
		System.out.println("Total Salary Of Manager :"+salary);
	}

}
