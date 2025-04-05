package BasicProgram;

import java.util.Scanner;

public class CalculatePower {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a power ");
		int p = sc.nextInt();
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		int r = 1;
		
		for(int i=1; i<=p; i++)
		{
			r = r * n;
		}
		System.out.println("Power of "+n+" is "+r);
	}

}
