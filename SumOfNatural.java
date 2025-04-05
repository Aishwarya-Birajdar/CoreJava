package BasicProgram;

import java.util.Scanner;

public class SumOfNatural {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		int i;
		int sum=0; // for loop
		int sum1=0;  // while loop
		int sum2=0;   // do while loop
		
		System.out.println("Natural Number");
		
		// For loop
		
		for(i=1; i<=n; i++)
		{
			System.out.print(i+" ");
			sum = sum + i;
		}
		
		System.out.println("\nSum using for loop "+sum);
		
		// while loop
		System.out.println();
		i=1;
		System.out.println("Using while loop");
		while(i <= 10)
		{
			System.out.print(i+" ");
			sum1 = sum1 + i;
			i++;
		}
		System.out.println("\nSum using while loop "+sum1);
		
		// Do while
		System.out.println();
		i=1;
		System.out.println("Using do while loop");
		do
		{
			System.out.print(i+" ");
			sum2 = sum2 + i;
			i++;
			
		}while(i<=10);
		System.out.println("\nsum using do while loop "+sum2);
	}

}
