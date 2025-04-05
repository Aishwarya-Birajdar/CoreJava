package Basic;

import java.util.*;
public class Calcutator {
	
	public static void main(String[] args) {
  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter second number:");
		double num2 = sc.nextDouble();
		
		System.out.println("Choose an operation (+, -, *, /):");
		char operation = sc.next().charAt(0);
		
		double result = 0;
		switch(operation) {
		case '+' : result = num1 + num2; break;
		case '-' : result = num1 - num2; break;
		case '*' : result = num1 * num2; break;
		case '/' : result = num1 / num2; break;
		case '%' : result = num1 % num2; break;
		default : System.out.println("Invalid Choice");
		}
		
		System.out.println("Calucluated Answers : "+result);
	}

}
