package Basic_Anudip;

import java.util.*;
public class CheckLeapYear {

	public static void main(String[] args) {
		
		/* Q. Write a program to check leap year using if else.
		     How to check whether a given year is a leap year or not
		 */
		
		// User Input using Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year : "); 
		int year = sc.nextInt();   // Year input from user
		
		/* Logic : Enter Year from user.
		 *   if (year % 4 == 0 and year % 100 != 0 ) ||  (year % 400 == 0 and year % 100 == 0)
		 */
		
		if((year % 400 == 0 && year % 100 == 0 )|| (year % 4 == 0 && year % 100 != 0 )) {
			System.out.println("Leap year "+year);
		} else {
			System.out.println("Non leap year " +year);
		}
		
		/* Output :
		     Enter Year : 
             2203
             Non leap year 2203
		 */
	}

}
