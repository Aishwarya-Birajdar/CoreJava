package Basic;

import java.util.Scanner;
public class Addition {
	
	void display() {
		System.out.println("display method");
	}

	
        public static void main(String[] args) {
		
		int a,b;
		a=34; b=6;
		System.out.println("Addition "+(a+b));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int c = sc.nextInt();
		System.out.println("Enter number : ");
		int d = sc.nextInt();
		
		System.out.println("Addition "+(c+d));
      }
}
