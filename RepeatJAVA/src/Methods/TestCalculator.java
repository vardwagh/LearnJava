package Methods;

public class TestCalculator {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		
		Calculator c = new Calculator();
		
		c.add(2, 3);
		System.out.println("Division result ="+c.div(3.9f, 1.3f));
		System.out.println("Multiplication Result ="+c.multiplication(3, 6));
		System.out.println("Substraction result ="+c.sub(6.3, 3.5));
		System.out.println("Concat :"+c.concate("HI ", "Vardhan"));

	}

}
