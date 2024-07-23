package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

import com.aurionpro.model.BankAccount;
import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.InvalidInputException;
import com.aurionpro.model.MinBalanceExceedsException;
import com.aurionpro.model.NegativeOrZeroAmountException;
import com.aurionpro.model.OverDraftLimitExceedsException;
import com.aurionpro.model.SavingAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long accountNumber = 0;
		String name = null;
		double balance = 0.0;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Enter how many accounts you want to create ?");
			int n = scanner.nextInt();

			BankAccount accounts[] = new BankAccount[n];
			for (int i = 0; i < n; i++) {
				scanner.nextLine();
				System.out.println("Enter the name of account holder ");

				name = scanner.nextLine();

				System.out.println("Enter the account balance");

				balance = scanner.nextDouble();
				if(balance<=0) throw new NegativeOrZeroAmountException(balance);
				
				accountNumber = setAccountNumber();

				System.out.println("Enter the type of account");
				System.out.println("1. Saving");
				System.out.println("2. Current");
				System.out.println("Enter the option");
				try {
					int response = scanner.nextInt();
					if (response != 1 && response != 2) {
						throw new InvalidInputException(response);
					}
					if (response == 1) {
						accounts[i] = new SavingAccount(accountNumber, name, balance, 500);
					} else if (response == 2) {
						accounts[i] = new CurrentAccount(accountNumber, name, balance, 5000);
					}
				} catch (Exception exception) {
					System.out.println(exception);
				}

				System.out.println("Congratulation!! " + name + ". Your " + accounts[i].getBankAccountType()
						+ " Account generated sucessfully. Your " + accounts[i].getBankAccountType()
						+ " account number is " + accounts[i].getAccountNumber());
			}

			operations(accounts, scanner);
			displayDetailsOfAccounts(accounts, scanner);
		} catch (Exception exception) {
			// TODO: handle exception
			System.out.println(exception);
		}
	}

	private static void operations(BankAccount accounts[], Scanner scanner) {
		for (int i = 0; i < accounts.length; i++) {

			boolean exitOption = false;
			while (!exitOption) {

				System.out.println("----------------------------------------------------------------");
				System.out.println("Name : " + accounts[i].getName());
				System.out.println("Account Number : " + accounts[i].getAccountNumber());
				System.out.println(
						"You can perform this operations on your " + accounts[i].getBankAccountType() + " account.");
				System.out.println("1. Check Balance");
				System.out.println("2. Deposit Money");
				System.out.println("3. Withdraw Money");
				System.out.println("4. Exit");
				System.out.println("Please choose an option: ");
				int choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Your current balance is " + accounts[i].getBalance());
					break;
				case 2:
					System.out.println("Enter the deposit amount");
					try {
						double amount = scanner.nextDouble();
						accounts[i].credit(amount);
					} catch (NegativeOrZeroAmountException exception) {
						System.out.println(exception.getMessage());
					}
					break;
				case 3:
					System.out.println("Enter the withdrawl amount");
					try {
						double amount = scanner.nextDouble();
						accounts[i].debit(amount);
					} catch (MinBalanceExceedsException exception) {
						System.out.println(exception.getMessage());
					} catch (OverDraftLimitExceedsException exception) {
						System.out.println(exception.getMessage());
					} catch (NegativeOrZeroAmountException exception) {
						System.out.println(exception.getMessage());
					} catch (Exception exception) {
						// TODO: handle exception
						System.out.println(exception);
					}
					break;
				case 4:
					exitOption = true;
					System.out.println("Thank You !!!");
					break;
				default:
					throw new InvalidInputException(choice);
				}
			}
		}
	}

	private static void displayDetailsOfAccounts(BankAccount accounts[], Scanner scanner) {
		boolean exitOption = false;
		while (!exitOption) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1. Display the details of all accounts");
			System.out.println("2. Display the details of saving accounts");
			System.out.println("3. Display the details of current accounts");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				BankAccount.display(accounts);
				break;
			case 2:
				SavingAccount.display(accounts);
				break;
			case 3:
				CurrentAccount.display(accounts);
				break;
			default:
				throw new InvalidInputException(choice);
			}
		}
	}

	private static long setAccountNumber() {
		Random random = new Random();
		return 10000000000L + (long) (random.nextDouble() * 9000000000L);
	}
}
