package methodOverridingExample;

public class Hr  extends Employee
{
	int noOfRecruitment;
	public Hr(int empId, String name, int salary, int noOfRecruitment) 
	{
		super(empId, name, salary);
		// TODO Auto-generated constructor stub
		this.noOfRecruitment=noOfRecruitment;
	}
	
	void totalSalary(int incentive)
	{
		super.display();
		this.salary= salary+(noOfRecruitment*incentive);
		System.out.println("Total Salary Of HR :"+salary);
	}

}
