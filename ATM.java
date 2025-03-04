package Basic;

import java.util.*;
public class ATM {

	public static void main(String[] args) {
		
		/* A simple ATM system where the user can check balance, deposit, 
		  and withdraw.
		*/
		
		Scanner sc = new Scanner(System.in);
		double balance = 1000.0;
		int choice;
		
		do {
			System.out.println("ATM Menu");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			    case 1:
				    System.out.println("Current Balance: Rs " + balance);
				    break;
				    
				case 2:
				    System.out.print("Enter deposit amount: ");
				    double deposit = sc.nextDouble();
				    balance += deposit;
				    System.out.println("Deposited Rs " + deposit);
				    break;
				    
				case 3:
				    System.out.print("Enter withdrawal amount: ");
				    double withdraw = sc.nextDouble();
				    if (withdraw > balance) {
				       System.out.println("Insufficient balance.");
				    } else {
				    balance -= withdraw;
				    System.out.println("Withdrew Rs " + withdraw);
				    }
				    break;
				    
				case 4:
				    System.out.println("Thank you for using the ATM.");
				    break;
				    
				default:
				    System.out.println("Invalid choice.");
			}
		} while(choice != 4);
		
	}

}
