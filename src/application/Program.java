package application;

import java.util.Locale;
import java.util.Scanner;
import entities.BankAccount;

/*
This program registers a bank account.

It also performs bank transactions such as deposit and withdrawal.
*/

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner s=new Scanner(System.in);
		System.out.print("Enter account number: ");
		int accountNumber=s.nextInt();
		System.out.print("Enter account holder: ");
		s.nextLine();
		String accountHolder=s.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char ans=s.next().charAt(0);
		BankAccount ba;
		
		if(ans=='y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit=s.nextDouble();
		    ba= new BankAccount(accountNumber, accountHolder, initialDeposit);
		}
		else {
		    ba= new BankAccount(accountNumber, accountHolder);
			
		}
		
		System.out.println("\nAccount Data:");
		System.out.println(ba);
		System.out.println();
		System.out.print("Enter a deposit value: ");
		ba.increaseBalance(s.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(ba);
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		ba.decreaseBalance(s.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(ba);
		s.close();

	}

}
