package Basic;

import java.util.*;
public class VowelConstantsCount {

	public static void main(String[] args) {
		
		// Count the number of vowels and consonants in a given string.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine().toLowerCase();
		int vowel = 0, consonants = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowel++;
				} else {
					consonants++;
				}
			}
		}
		
		System.out.println("Number of Vowels "+vowel);
		System.out.println("Number of Consonants "+consonants);
		
		
	}

}
