package Basic;

import java.util.*;
public class YearCheck {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Year");
		int year = scan.nextInt();
		
		if((year % 400 == 0 && year % 100 == 0 )|| (year % 4 == 0 && year % 100 != 0 )) {
			System.out.println("Leap year "+year);
		} else {
			System.out.println("Non leap year");
		}
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a leap year.");
			} else {
			System.out.println(year + " is not a leap year.");
			}
		
	}

}
