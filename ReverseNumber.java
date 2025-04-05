package BasicProgram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		
		System.out.println(n);
		int r ;
		
		System.out.println("Reverse Number ");
		while(n > 0)
		{
			r=n%10;
			System.out.print(r+"");
			n=n/10;
		}
	}

}
