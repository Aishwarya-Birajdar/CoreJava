package BasicProgram;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = sc.nextInt();
		System.out.println("Enter b : ");
		int b = sc.nextInt();
		
		System.out.println("a : "+a+" "+" b: "+b);
		
		// Arithmetic operation
		
		System.out.println("Addition : "+(a+b));
		System.out.println("substaction : "+(a-b));
		System.out.println("mult : "+(a*b));
		System.out.println("div : "+(a/b));
		System.out.println("modulo : "+(a%b));
		System.out.println("Bitwise or : "+(a|b));
		System.out.println("Bitwise : "+(a&b));
		
		// logical 
		System.out.println("Enter c : ");
		int c = sc.nextInt();
		System.out.println("c : "+c);
		System.out.println("And : "+((a>b) && (a>c)));
		System.out.println("OR : "+((a>b) || (a>c)));
		System.out.println("Not : "+(!(a>b) || (a>c)));
		
		
		// Relational 
		System.out.println("comparsion : "+(a == b));
		System.out.println("greater : "+(a > b));
		System.out.println("less : "+(a < b));
		System.out.println("greater than equal : "+(a >= b));
		System.out.println("smaller than equal : "+(a <= b));
		System.out.println("Not equal : "+(a!=b));
		
		// Increment Decrement
		System.out.println("Pre inc "+(++a));
		System.out.println("pre dec "+(--a));
		System.out.println("Post inc "+(b++));
		System.out.println("Post dec "+(b--));
		
		// Ternary
		int ans = (a>b)? a : b;
		System.out.println("ans "+ans);
		
		int d = (a>b)? (a>c ? a : c) : (b>c ? b : c);
		System.out.println("d "+d);
		
		
	}
}
