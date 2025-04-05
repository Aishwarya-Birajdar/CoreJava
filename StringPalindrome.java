package Basic;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String >> ");
		String s = sc.nextLine();
		String rev = "";
		
		for (int i=s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		
		System.out.println("Reverse String is "+rev);
		
		if(s.equals(rev)) {
			System.out.println(s+" is palindrome");
		} else {
			System.out.println(s+" is not palindrome");
		}
		
	}

}
