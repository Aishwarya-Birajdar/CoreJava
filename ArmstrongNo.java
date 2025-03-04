package Basic;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = s.nextInt();
		int o = n;
		int arm = 0;
		
		while(n > 0) {
			int rem = n % 10;
			arm = (rem*rem*rem) + arm;
			n = n / 10;
		}
		
		if (o == arm) {
			System.out.println(o+ " is armstrong number");
		} else {
			System.out.println(o+" is not armstrong number");
		}
		
		
		// Another way
		System.out.print("Enter a number: ");
		int num = s.nextInt();
		int sum = 0, originalNum = num, remainder, digits = 0;
		
		// Calculate the number of digits
		while (num != 0) {
		num /= 10;
		digits++;
		}
		
		num = originalNum;
		while (num != 0) {
		remainder = num % 10;
		sum += Math.pow(remainder, digits);
		num /= 10;
		}
		
		if (sum == originalNum) {
		System.out.println(originalNum + " is an Armstrong number.");
		} else {
		System.out.println(originalNum + " is not an Armstrong number.");
	}

	}
}