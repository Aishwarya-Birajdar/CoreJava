package BasicProgram;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number ");
			int n = sc.nextInt();
			int c = n;
			int arm = 0;
			int rem;
			
			while(n > 0)
			{
			    rem = n % 10;
			    arm = (rem*rem*rem) + arm;
			    n = n / 10;
			}
			if(c == arm)
			{
				System.out.println("Armstrong Number ");
			}
			else
			{
				System.out.println("Not Armstrong Number");
			}
			
	}

}
