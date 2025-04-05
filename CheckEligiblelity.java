package Basic_Anudip;

import java.util.Scanner;

public class CheckEligiblelity {

	public static void main(String[] args) {
		
	// Q. 2. Write java program to check  candidate eligible for voting or not.
		
		// User Input using Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : "); 
		int age = sc.nextInt();   // age input from user
		
		// Logic
		if (age >= 18) {
			System.out.println("Eligible For Vote");
		} else {
			System.out.println("Not Eligible for voting");
		}
		
		/* Output : 
		      Enter Age : 
              34
              Eligible For Vote
		 */

	}

}
