package Basic;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		
		/* Check whether a given number is a palindrome  */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int original = num;
		int rev = 0;  
		
		while(num > 0) {
		   int rem = num % 10;
		   rev = rev * 10 + rem;
		   num = num / 10;
		}
		
		if (original == rev) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Not a palindrome number");
		}
	}

}
