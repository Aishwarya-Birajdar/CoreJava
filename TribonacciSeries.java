package BasicProgram;

import java.util.Scanner;

public class TribonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Term ");
		int term = sc.nextInt();
		
		int a = 0, b = 1, c = 2, d;
		
		for(int i=1; i<=term; i++)
		{
			System.out.print(a +" ");
			d = a + b + c;
			a = b;
			b = c;
			c = d;
		}
	}

}
