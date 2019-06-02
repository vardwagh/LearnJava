package methodOverriding;

public class Apple extends Fruit
{

	
	void eat(int a) 
	{
		System.out.println("Child Class Apple "+a);
		super.eat(3);
	}

}
