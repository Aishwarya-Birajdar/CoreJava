package Basic_Anudip;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		
		// Q. Write a program to check given number is prime number or not.
		
		// User Input
		Scanner sc = new Scanner(System.in);  // Scanner class for input
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int count = 0;  
		
		/* A number n is prime if it is not divisible by any number from
		   2 to sqrt(n). 
		                  or
		   a prime number is a number greater than 1 that has only two 
		   divisors 1 and itself.              
		 */
		
		for (int i=1; i<=num; i++) {   // iteration 1 to n
			if (num % i == 0) {  // count how many no divide num without a remider
				count++;       
			}
		}
		
		if (count == 2) {        // count == 2 it is prime no otherwise not
			System.out.println(num+" is prime number");
		} else {
			System.out.println(num+" is not prime number");
		}
		
		
	/*	output :
			Enter Number
			5
			5 is a prime number.
    */
		
	}

}
