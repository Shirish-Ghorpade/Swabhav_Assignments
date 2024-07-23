package com.aurionpro.model;

public class BankAccount {
	private long accountNumber;
	private String name;
	private double balance;
	private BankAccountType bankAccountType;

	public BankAccount() {
		this.accountNumber = 0;
		this.name = "Not get value yet";
		this.balance = 0.0;
		this.bankAccountType = BankAccountType.SAVING;
	}

	public BankAccount(long accountNumber, String name, double balance, BankAccountType bankAccountType) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.bankAccountType = bankAccountType;
	}

	public BankAccountType getBankAccountType() {
		return bankAccountType;
	}

	public void setBankAccountType(BankAccountType bankAccountType) {
		this.bankAccountType = bankAccountType;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if(balance < 0) {
			throw new NegativeOrZeroAmountException(balance);
		}
		this.balance = balance;
	}

	public void credit(double amount) {
		if (amount <= 0) {
			throw new NegativeOrZeroAmountException(amount);
		}
		balance += amount;
		System.out.println("You deposited " + amount + " so, current balance of account number " + getAccountNumber()
				+ " is " + getBalance());
	}

	public void debit(double amount) {
		if (amount <= 0) {
			throw new NegativeOrZeroAmountException(amount);
		}
		if (amount > balance) {
			throw new InsufficientBalanceException(amount, balance);
		}
		this.balance -= amount;
	}

	public static void display(BankAccount accounts[]) {
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("---------------------------------------------");
			System.out.println("Account Number : " + accounts[i].accountNumber);
			System.out.println("Account Holder Name : " + accounts[i].name);
			System.out.println("Balance of ccount : " + accounts[i].balance);
			System.out.println("Account Type : " + accounts[i].bankAccountType);
		}
	}
}
