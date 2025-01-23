package Basic_Anudip;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {   // main method
		
		// User Input
		Scanner sc = new Scanner(System.in);  // Scanner class for input
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int sum = 0;    // starting sum = 0;
		
		/* A number whose sum of factors (excluding the number itself) 
           equal to the number is called a perfect number.
		  */
		
		for (int i=1; i<=num/2; i++) {  
			if (num % i == 0) {   
				sum = sum + i;
			}
		}
		
		if (num == sum) {  
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not Perfect Number");
		}
		
	  /*output :
		Enter Number
		6
		Perfect Number
      */
		
	}

}
