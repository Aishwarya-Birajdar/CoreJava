package Basic_Anudip;

import java.util.Scanner;
public class UserInput {

	public static void main(String args[]) {
		System.out.println("Enter Name : ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("My name is "+name);
		
		scanner.close();
	}
}
