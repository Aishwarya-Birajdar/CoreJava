package BasicProgram;

import java.util.Scanner;

public class PrintOddEvenNo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = s.nextInt();
		int i;
		
		System.out.println("Print odd no");
		for(i=1; i<=n; i=i+2)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("Print Even no");
		for(i=0; i<=n; i=i+2)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		// while loop
		System.out.println("Odd no");
		int j=1;
		while(j<=n)
		{
			System.out.print(j+" ");
			j=j+2;
		}
		
		System.out.println();
		System.out.println("Even no");
		 j=0;
		while(j<=n)
		{
			System.out.print(j+" ");
			j=j+2;
		}
		
		s.close();
	}

}
