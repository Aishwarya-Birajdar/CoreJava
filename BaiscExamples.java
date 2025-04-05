package Basic;

import java.util.Scanner;

public class BaiscExamples {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Questions.
		//  1 Simple "Hello World" Program
		       
		    System.out.println("Hello World");
		       
	//  2. Print Name and Age Using Variables
		    
		    String Name = "Hello";
		    int Age = 34;
		    
		    System.out.println("Name : "+Name);
		    System.out.println("Age : "+Age);
		    
	//  3. Calculate and Print the Area of a Rectangle
		    
		    double length = 3;
		    double width = 4;
		    double area = length * width;
		    System.out.println("Area "+area);
		    
	//	  4. Add Two Numbers and Display the Result
		    
		    int a=35, b=45;
		    System.out.println("addition  : "+(a+b));
		    
	//	  5. Program to Concatenate Strings
		    
		    String firstName = "ais";
		    String lastName = "bir";
		    String fullName = firstName+" "+lastName;
		    System.out.println("FullName "+fullName);
		    
		    System.out.println("fullName : "+firstName+lastName);
		    
	//	  6. Swap Two Numbers Using a Temporary Variable
		    System.out.println("using third variable");
		    System.out.println("a: "+a+" b:"+b);
		     int temp = a;
		     a=b;
		     b=temp;
		     System.out.println("a ; "+a+" b: "+b);
		     
	//	  7. Swap Two Numbers without Using a Temporary Variable
		     System.out.println("using + and -");
		     a = a+b;
		     b = a-b;
		     a = a-b;
		     System.out.println("a ; "+a+" b: "+b);
		     
		     System.out.println("using ^");
		     a = a ^ b;
		     b = a ^ b;
		     a = a ^ b;
		     System.out.println("a ; "+a+" b: "+b);
		     
	//	  8. Convert Celsius to Fahrenheit
		     
	//	  9. Check if a Number is Positive or Negative
		     System.out.println("Enter Number");
		     int n = sc.nextInt();
		     if (n > 0) {
		    	 System.out.println("Positive");
		     } else {
		    	 System.out.println("Negative");
		     } 
		     
	//	  10. Simple Program to Print the Length of a String
		     
		     String name = "Java";
		     int len = name.length();
		     System.out.println("Length of String "+name+" is "+len);
		     
//		  11. Print a Pattern of Stars
//		       *
//		       **
//		       ***
//		       ****
//		       *****
		     
		     for (int i=1; i<=5; i++) {
		    	 for (int j=1; j<=i; j++) {
		    		 System.out.print("* ");
		    	 }
		    	 System.out.println();
		     }
		     
		//  12. Check if a Number is Even or Odd
		     
		     if (n % 2 == 0) {
		    	 System.out.println("Even");
		     } else {
		    	 System.out.println("Odd");
		     }
		     
		//  13. Find the Largest of Three Numbers
		     
		     int num1=34, num2=45, num3=5;
		     if (num1 > num2 && num1 > num3) {
		    	 System.out.println("num1 is greter");
		     } else if (num2 > num1 && num2 > num3) {
		    	 System.out.println("num2 is greter");
		     } else {
		    	 System.out.println("num3 is greter");
		     }
		     
	    //  14. Grade Classification Based on Marks (Switch-Case)
	    //  15. Print Fibonacci Series Using a For Loop
		//  16. Sum of Natural Numbers Using a While Loop
		//  17. Check if a Year is a Leap Year
	    //  18. Print Multiplication Table of a Number
    	//  19. Print Sum of Even Numbers in a Range
	    //  20. Count the Number of Digits in a Number
		//  21. Find the Factorial of a Number Using Recursion
		 
		
		
	}

}
