package BasicProgram;

import java.util.Scanner;

public class LargestNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers ");
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > b)
		{
			if(a > c)
			{
				System.out.println("A is largest");
			}
			else
			{
				System.out.println("C is largest");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("B is largest");
			}
			else
			{
				System.out.println("C is largest");
			}
		}
	}

}
