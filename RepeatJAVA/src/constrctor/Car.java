package constrctor;

public class Car 
{
	int modelNumber;
	String name;
	
	Car()
	{
		System.out.println("Default Constructor called");
		modelNumber=1111;
		name="Honda";
		this.display();
	}
	
	Car(int modelNumber,String name)
	{
		this.modelNumber=modelNumber;
		this.name=name;
		System.out.println("Parameterized Constructor called");
	}
	
	
	void display()
	{
		System.out.println(modelNumber+" "+name);
	}
	
	public static void main(String[] args)
	{
		
		Car c = new Car();
		c.display();
		Car c2= new Car(10001, "Tata");
		c2.display();
	}
}
