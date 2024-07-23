package com.aurionpro.model;

public class SavingAccount extends BankAccount{
	private double MIN_BALANCE;
	
	public SavingAccount(long accountNumber, String name, double balance, double MIN_BALANCE) {
		super(accountNumber, name, balance, BankAccountType.SAVING);
		this.MIN_BALANCE = MIN_BALANCE;
	}
	
	public double getMIN_BALANCE() {
		return MIN_BALANCE;
	}

	public void setMIN_BALANCE(double MIN_BALANCE) {
		this.MIN_BALANCE = MIN_BALANCE;
	}
	public void debit(double amount) {
		if (amount <= 0) {
			throw new NegativeOrZeroAmountException(amount);
		}
		else if (amount > super.getBalance()-MIN_BALANCE) {
			throw new MinBalanceExceedsException(amount, super.getBalance(), MIN_BALANCE);
		} 
		double operation = super.getBalance()-amount;
		super.setBalance(operation);
		System.out.println("You withdraw " + amount + " so, current balance of account number "
				+ super.getAccountNumber() + " is " + super.getBalance());
	}

	public static void display(BankAccount accounts[]) {

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBankAccountType() == BankAccountType.SAVING) {
				System.out.println("Account Number : " + accounts[i].getAccountNumber());
				System.out.println("Account Holder Name : " + accounts[i].getName());
				System.out.println("Balance of Account : " + accounts[i].getBalance());
			}

		}
	}
}
