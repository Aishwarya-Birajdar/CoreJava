package BasicProgram;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// Using 3 variable
		System.out.println("Before swapping ");
		System.out.println("A : "+a+" "+" B : "+b);
		
		System.out.println("After swapping ");
		int c = a;
		a = b;
		b = c;
		System.out.println("A : "+a+" "+" B : "+b);
		
		System.out.println();
		
		// using without 3 variable
		
		System.out.println("After swapping ");
	    a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("A : "+a+" "+" B : "+b);
		
	}

}
