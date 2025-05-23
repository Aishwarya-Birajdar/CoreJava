package Basic;

import java.util.Scanner;

public class BankAccount {

	/* Simulate a simple bank account system where the user can deposit, 
	   withdraw, and check balance.
	   
	   Real-Life Example: A real-world ATM or banking system where users 
	   perform transactions like depositing, withdrawing, or checking 
	   account balances
	   
	 */
		
	private double balance;
	
	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: Rs " + amount);
	}
	
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdrew: Rs " + amount);
		} else {
			System.out.println("Insufficient balance.");
		}
	}
	
	public void checkBalance() {
		System.out.println("Balance: Rs " + balance);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BankAccount account = new BankAccount(1000);  
		int choice;
		do {
			System.out.println("Bank Menu");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			
		switch (choice) {
			case 1:
				System.out.print("Enter amount to deposit: ");
				double depositAmount = sc.nextDouble();
				account.deposit(depositAmount);
				break;
				
			case 2:
				System.out.print("Enter amount to withdraw: ");
				double withdrawAmount = sc.nextDouble();
				account.withdraw(withdrawAmount);
				break;
				
			case 3:
				account.checkBalance();
				break;
				
			case 4:
				System.out.println("Exiting... Thank you for using our bank.");
				break;
			
			default:
				System.out.println("Invalid choice.");
			}
		
		} while (choice != 4);
	}


}
