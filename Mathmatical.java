package BasicProgram;

import java.util.Scanner;

public class Mathmatical {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double area;
		// Find area of Square
		System.out.println("Enter side of square ");
		int side = sc.nextInt();
		area = side * side;
		System.out.println("Side of squeare "+area);
		
		// Area of Rectangle
		System.out.println("\nEnter length ");
		int l = sc.nextInt();
		System.out.println("Enter Breath ");
		int b = sc.nextInt();
		area = l*b;
		System.out.println("Area of Reactangle "+area);
		
		// Area of circle
		final double pi = 3.14;
		System.out.println("\nEnter Radius ");
		int r = sc.nextInt();
		area = pi*r*r;
		System.out.println("Area of circle "+area);
		
		// Area of Triangle
		System.out.println("\nEnter 3 side of triangle ");
		int a = sc.nextInt();
		int d = sc.nextInt();
		int c = sc.nextInt();
		int sp = a+d+c/2;
		area = Math.sqrt(sp*(sp-a)*(sp-d)*(sp-c));
		System.out.println("Area of Triangle "+area);
		
		
		
	}

}
