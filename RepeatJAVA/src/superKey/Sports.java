package superKey;

import java.util.Scanner;

public class Sports extends Marks
{
	int score;
	
	
	 public Sports(int rollNO, String name, int marks, int score)
	 {
		super(rollNO, name, marks);
		this.score=score;
		// TODO Auto-generated constructor stub
	}


	void display()
	 {
		 System.out.println(rollNO+" "+name+" "+marks+" "+score);
	 }

}
