package assignments;

import java.util.Scanner;

public class MyBank 
{
	int account_no;
	String name;
	int balance_amount;
	
	void insertData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number to create Account:");
		account_no=sc.nextInt();
		System.out.println("Enter Account Holder Name:");
		name=sc.next();	
		System.out.println("Enter Account Opening Amount:");
		balance_amount=sc.nextInt();
		System.out.println();
		System.out.println("Account Opened Succesfully!");
	}
	
	int deposit(int deposite_amt)
	{
		balance_amount=balance_amount+deposite_amt;
		return balance_amount;	
	}
	
	int withdraw(int withdraw_amt)
	{
		if(withdraw_amt>balance_amount)
		{
			System.out.println("insufficient Balace");
		}
		else
		{
			balance_amount=balance_amount-withdraw_amt;
		}
		
		return balance_amount;
	}
	
	void checkBalance(int ac_no)
	{	
		if(account_no==ac_no)
		{
		System.out.println("Your Account Balance is:"+balance_amount);
		}
		else
		{
		System.out.println("Your Account Number Incorrect");
		}
	}
	void displayDetails()
	{
		System.out.println("Your Account Number is:"+account_no);
		System.out.println("Your Account Holder Name is:"+name);
		System.out.println("Your Account Balance is:"+balance_amount);
	}
}
