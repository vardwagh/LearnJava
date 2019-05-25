package assignments;

import java.util.Scanner;

public class TestMyBank {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MyBank mb = new MyBank();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** Welcome to Mybank ***");
		mb.insertData();
		
		do
		{
			
			System.out.println("*** Select From Menu ***");
			System.out.println("1.deposite"+"\n"+"2.withdraw"+"\n"+"3.Check balance"+"\n"+"4.Display Details"+"\n"+"5.Exit");
			
			System.out.println();
			System.out.println("Enter Choice:");
			int choice = sc.nextInt();
			
			switch (choice)
			{
			case 1:
				System.out.println("Enter Amount to Deposite:");
				int deposite_amt=sc.nextInt();
				int upbal=mb.deposit(deposite_amt);
				System.out.println("Current Balance:"+upbal);
				break;
			case 2:
				System.out.println("Enter Amount to withdraw:");
				int withdraw_amt=sc.nextInt();
				int upbal1=mb.withdraw(withdraw_amt);
				System.out.println("Current Balance:"+upbal1);
				break;
			case 3:
				System.out.println("Enter Acount number to check balance:");
				int ac_no=sc.nextInt();
				mb.checkBalance(ac_no);
				break;
			case 4:
				mb.displayDetails();
				break;
			case 5:
				System.exit(1);
				break;
			default:
				System.out.println("invalid choice");
				
			
			}
		}
		while(true);
		
		
		
		
		
		
		

	}

}
