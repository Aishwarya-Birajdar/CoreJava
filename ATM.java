package BasicProgram;

import java.util.*;
public class ATM {

	public static void main(String[] args) {
		
		/*Q. A simple ATM system where the user can check balance, deposit, 
		     and withdraw.
		*/
		
		Scanner sc = new Scanner(System.in);
		double balance = 2000;
		int choice;
		
		do {
			System.out.println("ATM Services");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
			
			switch(choice) {
			   case 1:
				   System.out.println("Available Balance : Rs."+ balance); 
				   break;
			   case 2:
				   System.out.println("Enter Deposited Amount");
				   double deposite = sc.nextDouble();
				   deposite = deposite + balance;
				   System.out.println("Deposited : Rs."+ deposite);
				   
			   case 3:
				   System.out.println("Enter Withdrawel Amount");
				   double withdraw = sc.nextDouble();
				   if (withdraw > balance) {
					   System.out.println("Insufficent Balance");
				   } else {
					   balance = withdraw - balance;
				       System.out.println("Withdraw : Rs."+ balance);
				   }
				   break;
				   
			   case 4:
				   System.out.println("Thank you for using ATM");
				   break;
				   
			   default :
				   System.out.println("Invalid Choice");	   
			}
		} while (choice != 4);
	}

}
