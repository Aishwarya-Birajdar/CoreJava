package BasicProgram;

import java.util.Scanner;

public class StringBasicPrograms {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Strings Value : ");
		String s = sc.nextLine();
		String s1 = sc.nextLine();
		
		// compare two String reference value
		if(s == s1)
		{
			System.out.println("Equal ");
		}
		else
		{
			System.out.println("Not Equal ");
		}
		
		System.out.println();
		// it check data
		if(s.equals(s1))
		{
			System.out.println("Equal ");
		}
		else
		{
			System.out.println("Not Equal ");
		}
		
		// String Method
		System.out.println("Lower case : "+s.toLowerCase());
		System.out.println("Upper case : "+s.toUpperCase());
		System.out.println("Concat : "+s.concat(" "+s1));
		System.out.println("Length : "+s.length());
		System.out.println("Trim : "+s.trim());
		System.out.println("Index of :"+s.indexOf(0));
		System.out.println("Check Empty : "+s.isEmpty());
		System.out.println("Char at : "+s.charAt(2));
		System.out.println("Replace : "+s.replace('i', 'a'));
		System.out.println("Equal : "+s.equals(s1));
		
		// string created using two ways
		String a = "Learn";
		System.out.println(a);
		String b = new String("Java");
		System.out.println(b);
		
		// StringBuffer
		StringBuffer c = new StringBuffer("Learn JAva");
		System.out.println(c.reverse());
		
		// StringBuilder
		StringBuilder r = new StringBuilder("Java");
		System.out.println(r.reverse());
				
		
	}

}
