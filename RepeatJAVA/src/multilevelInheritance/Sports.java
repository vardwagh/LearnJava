package multilevelInheritance;

import java.util.Scanner;

public class Sports extends Marks
{
	int score;
	
	void inputScore()
	 {	
		
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter Student Sport Score:");
			score=sc.nextInt();
	 }
	
	 void display()
	 {
		 System.out.println(rollNO+" "+name+" "+marks+" "+score);
	 }

}
