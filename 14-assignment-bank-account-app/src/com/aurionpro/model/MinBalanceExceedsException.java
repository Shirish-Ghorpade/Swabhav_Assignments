package com.aurionpro.model;

public class MinBalanceExceedsException extends RuntimeException{
	private double amount;
	private double balance;
	private double MIN_BALANCE;
	
	
	public MinBalanceExceedsException(double amount, double balance, double MIN_BALANCE) {
		super();
		this.amount = amount;
		this.balance = balance;
		this.MIN_BALANCE = MIN_BALANCE;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Your current balance is "+balance+" You entered amount "+ amount+" which exceeds the minimum balance limit "+MIN_BALANCE+". Please enter smaller amount";
	}
	
}
