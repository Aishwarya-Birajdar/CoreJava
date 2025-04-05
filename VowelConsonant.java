package BasicProgram;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character ");
		char n = sc.next().charAt(0);
		
		if(n=='A' || n=='E'|| n=='I' || n=='O' || n=='U'|| n=='a' || n=='e' ||
				n=='i'|| n=='o'|| n=='u')
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
	}

}
