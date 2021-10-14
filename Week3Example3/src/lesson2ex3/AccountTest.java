package lesson2ex3;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account("Jane Green", 50.50);
		Account account2 = new Account("John Blue", -7.53);

		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account 1: "); //prompt
		double depositAmount = input.nextDouble();
		
		System.out.printf("%nAdding %.2f to account 1 balance %n%n", depositAmount);
		
		account1.deposit(depositAmount);
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
		
		double withdrawlAmount;
		
		System.out.printf("Enter withdrawal amount for account 1:");
		withdrawlAmount = input.nextDouble();
		
		System.out.printf("%nWithdrawing %.2f from account 1 balance %n%n", withdrawlAmount);
		
		account1.withdraw(withdrawlAmount);		
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
		
	}

}
