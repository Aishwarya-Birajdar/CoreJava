package Basic;

import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Digits ");
		int num = s.nextInt();
		int rev = 0;
		
		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		
		System.out.println("Reverse Digit is : "+rev);
		
		System.out.println("Another way");
		int num1 = s.nextInt();
		while(num1 > 0) {
			int rem = num1 % 10;
			System.out.print(rem);
			num1 = num1 / 10;
		}
	}

}
