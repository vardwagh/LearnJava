package encapsulation;

public class Employee 
{
	int empId;
	String name;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		
		if(empId>100)
		{
			this.empId = empId;
		}
		else
		{
			System.out.println("Employee ID should be greater than 100");
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) 
	{
		
		Employee e = new Employee();
		e.setEmpId(11);
		e.setName("Vardhan");
		
		System.out.println(e.getEmpId()+" "+e.getName());
	}
	

}
