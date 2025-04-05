package BasicProgram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter String value ");
	   String s = sc.nextLine();
	   String r = "";
	   int l = s.length();
	   
	   for(int i=l-1; i>=0; i--)
	   {
		   r = r + s.charAt(i);
	   }
	   System.out.println("Reverse String :  "+r);
	}

}
