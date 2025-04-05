package BasicProgram;

import java.util.Scanner;

public class FindPrimeNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1 ");
		int n1 = sc.nextInt();
		System.out.println("Enter number2 ");
		int n2 = sc.nextInt();
		int i,j;
	
		System.out.println("Prime numbers : ");
		for(i=n1; i<=n2; i++)
		{
			for(j = 2; j<=i; j++)
			{
				if(i%j == 0)
				{
					break;
				}
			}
			if(i == j)
			{
				System.out.print(j+" ");
			}
		}
		
		
	
	}

}
