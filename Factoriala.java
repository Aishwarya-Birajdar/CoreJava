package Basic;

import java.util.Scanner;

public class Factoriala {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter number");
	    int n = sc.nextInt();
	    int fact = 1;
	    
	    for (int i=1; i<=n; i++) {
	    	fact *= i;
	    }
	    
	    System.out.println("Factorial of "+n+" is "+fact);
	    
	    int f=1;
	    
	    while (n > 0) {
	    	f *= n;
	    	n--;
	    }
	    
	    System.out.println("Factorial "+f);
	}

}
