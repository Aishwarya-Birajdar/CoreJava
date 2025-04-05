package BasicProgram;

import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = sc.nextInt();
		int prod = 1, r;
		
		while(n > 0)
		{
			r = n % 10;
			prod = prod * r;
			n = n / 10;
		}
		System.out.println("Enter Product of Digit "+prod);
	}

}
