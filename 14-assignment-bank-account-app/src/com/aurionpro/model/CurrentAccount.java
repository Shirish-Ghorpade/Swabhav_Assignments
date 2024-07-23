package com.aurionpro.model;

public class CurrentAccount extends BankAccount {
	private double OVER_DRAFT_LIMIT;
	private double loan = 0;

	public CurrentAccount(long accountNumber, String name, double balance, double OVER_DRAFT_LIMIT) {
		super(accountNumber, name, balance, BankAccountType.CURRENT);
		this.OVER_DRAFT_LIMIT = OVER_DRAFT_LIMIT;
	}

	public double getOVER_DRAFT_LIMIT() {
		return OVER_DRAFT_LIMIT;
	}

	public void setOVER_DRAFT_LIMIT(double OVER_DRAFT_LIMIT) {
		this.OVER_DRAFT_LIMIT = OVER_DRAFT_LIMIT;
	}

	public void credit(double amount) {
		if (amount <= 0) {
			throw new NegativeOrZeroAmountException(amount);
		} else if (loan == 0) {
			super.setBalance(super.getBalance() + amount);
		} else if (amount <= loan) {
			loan -= amount;
		} else if (amount > loan) {
			super.setBalance(amount - loan);
			loan=0;
		}
		System.out.println(
				"You deposited " + amount + " so, current balance of account number " + super.getAccountNumber()
						+ " is " + super.getBalance() + " and your remaining loan is " + loan);

	}

	public void debit(double amount) {
		if (amount <= 0) {
			throw new NegativeOrZeroAmountException(amount);
		} else if (amount <= super.getBalance()) {
			super.setBalance(super.getBalance() - amount);
		} else if (amount <= super.getBalance() + OVER_DRAFT_LIMIT) {
			loan = amount-super.getBalance();
			super.setBalance(0);
		} else if (amount > super.getBalance() + OVER_DRAFT_LIMIT) {
			throw new OverDraftLimitExceedsException(amount, super.getBalance(), OVER_DRAFT_LIMIT);
		}
		System.out.println(
				"Now your account balance is " + super.getBalance() + " and you have loan of " + loan);
	}

	public static void display(BankAccount accounts[]) {
		System.out.println("----------------------------------------------------------");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBankAccountType() == BankAccountType.CURRENT) {
				System.out.println("Account Number : " + accounts[i].getAccountNumber());
				System.out.println("Account Holder Name : " + accounts[i].getName());
				System.out.println("Balance of Account : " + accounts[i].getBalance());
			}

		}
	}

}
