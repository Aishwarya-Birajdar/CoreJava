package BasicProgram;

import java.util.Scanner;

public class TotalAvgCalculate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,e;
		System.out.println("Enter 5 subject marks");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		
		int total = a+b+c+d+e;
		double avg = total/5.0;
		System.out.println("Total "+total+" \nAvg "+avg);
	}

}
