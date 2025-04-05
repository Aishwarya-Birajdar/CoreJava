package BasicProgram;

import java.util.Scanner;

public class SumOfOddEvenNo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = s.nextInt();
		int sum=0;
		
		if(n % 2 == 0) 
		{
			for(int i=0; i<=n; i+=2)
			{
				sum =sum + i;
			}
			System.out.println("sum of even no "+sum);
		}
		else
		{
			for(int i=1; i<=n; i+=2)
			{
				sum = sum + i;
			}
			System.out.println("sum of odd no "+sum);
		}
	}

}
