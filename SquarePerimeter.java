package Anudip;

import java.util.*;   
public class SquarePerimeter {

	public static void main(String[] args) {
		
		//write a program to find the perimeter of the square
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Side perimeter : ");
		int side = sc.nextInt();  // input from user
		
		double perimeter = 4 * side;   // Calculating perimeter using formula : 4 * side 
		System.out.println("Perimeter of square >> "+perimeter); // perimeter printing
		
		/* Output :
		         Enter a Side perimeter : 
                  4
                 Perimeter of square >> 16.0
		 */
		
	}

}
