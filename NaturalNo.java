package BasicProgram;

import java.util.Scanner;

public class NaturalNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		int i;
		
		System.out.println("Natural Number");
		
		for(i=1; i<=n; i++)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		i=1;
		System.out.println("Using while loop");
		while(i <= 10)
		{
			System.out.print(i+" ");
			i++;
		}
		
		System.out.println();
		i=1;
		System.out.println("Using do while loop");
		do
		{
			System.out.print(i+" ");
			i++;
			
		}while(i<=10);
	}

}
