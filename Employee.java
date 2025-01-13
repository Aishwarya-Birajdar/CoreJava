package Anudip;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		
  /* Write a Java program to take Employee id,name,address & salary from
      user and display on to screen.
   */

		Scanner sc = new Scanner(System.in);
		
		// Employee id, name, address and salary enter through user.
		System.out.println("Enter Employee Id : ");
		int id = sc.nextInt();   // id
		
		System.out.println("Enter Employee Name : ");
		String name = sc.next(); //name
		
		System.out.println("Enter Employee Address : ");
		String address = sc.next(); // address
		
		System.out.println("Enter Employee Salary : ");
		float salary = sc.nextFloat(); // salary
		
		// Display id, name, address, salary
		System.out.println("1. Id : "+id);
		System.out.println("2. Name : "+name);
		System.out.println("3. Address : "+address);
		System.out.println("4. salary : "+salary);
		
		/* Output :
		     Enter Employee Id : 1
             Enter Employee Name : jon
             Enter Employee Address : maharashtra
             Enter Employee Salary : 34344
       
             1. Id : 1
             2. Name : jon
             3. Address : maharashtra
             4. salary : 34344.0
		 */
		
    }

}
