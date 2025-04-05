package BasicProgram;

import java.util.Scanner;

public class switchProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b value ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		int choice = sc.nextInt();
		
		switch(choice)
		{
		  case 1 : c = a + b;
		           System.out.println("Addition "+c);
		           break;
		           
		  case 2 :  c = a - b;
                    System.out.println("sub "+c);
                    break;
                    
		  case 3 :   c = a * b;
                     System.out.println("multi "+c);
                     break;
                     
		  case 4 :    c = a / b;
                      System.out.println("Divi "+c);
                      break;
                      
		  case 5 :   c = a % b;
                     System.out.println("modulo "+c);
                     break;
                     
          default :
        	          System.out.println("Invalid choice ");
			  
		}
		
		sc.close();
	}

}
