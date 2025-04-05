package BasicProgram;

import java.util.Scanner;

public class UpperLowerCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Char : ");
		char ch = sc.nextLine().charAt(0);
		char ch1;
		
		if(ch >= 'A' && ch <= 'Z')
		{
			ch1 = Character.toLowerCase(ch);
			System.out.println("Lower Case : "+ch1);
		}
		else
		{
			ch1 = Character.toUpperCase(ch);
			System.out.println("Upper Case : "+ch1);
		}
	}

}
