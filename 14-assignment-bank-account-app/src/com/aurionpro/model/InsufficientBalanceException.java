package com.aurionpro.model;

public class InsufficientBalanceException extends RuntimeException {
	private double amount;
	private double balance;

	public InsufficientBalanceException(double amount, double balance) {
		super();
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Your entered amount is " + amount+ ". please enter the smaller amount than your balance "+balance;
	}
}
