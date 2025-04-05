package BasicProgram;

import java.util.Scanner;

public class PalindromNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = sc.nextInt();
		int c = n;
		int s = 0;
		int r;
		
		while(n > 0)
		{
		    r = n % 10;
		    s = (s*10) + r;
		    n = n / 10;
		}
		if(c == s)
		{
			System.out.println("Palindrome Number ");
		}
		else
		{
			System.out.println("Not Palindrome Number");
		}
	}

}
