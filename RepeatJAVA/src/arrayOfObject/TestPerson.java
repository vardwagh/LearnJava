package arrayOfObject;

import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of person to store :");
		int size= sc.nextInt();
		
		Person p[] = new Person[size];
		
		for (int i=0;i<size;i++)
		{
			System.out.println("Enter Name :");
			String name=sc.next();
			System.out.println("Enter Age :");
			int age=sc.nextInt();
			p[i]=new Person(age,name);
		}

		/*for (int i=0;i<size;i++)
		{
			p[i].display();
		}*/
		
		for(Person per:p)
		{
			per.display();
		}
	}

}
