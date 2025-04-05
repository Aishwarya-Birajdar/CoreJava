package BasicProgram;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year ");
		int y = sc.nextInt();
		
		if(y % 400 == 0)
		{
			if(y % 100 != 0)
			{
				if(y % 4 == 0)
				{
					System.out.println("Leap year");
				}
				else
				{
					System.out.println("Not leap year");
				}
			}
			else
			{   
			   System.out.println("leap year");
			}
		}
		else
		{
			System.out.println("Not leap year");
		}
		
		// another 
		System.out.println("Year Enter");
		int year = sc.nextInt();
		if((year % 400 == 0 && year % 100 == 0) 
				|| (year % 100 != 0 && year % 4 == 0))
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not Leap Year");
		}
	}

}
