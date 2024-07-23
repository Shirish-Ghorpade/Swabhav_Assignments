package com.aurionpro.model;

public class NegativeOrZeroAmountException extends RuntimeException{
	private double amount;

	public NegativeOrZeroAmountException(double amount) {
		super();
		this.amount = amount;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "You entered amount is "+amount+". Amount cannot be negative or zero. Please, Enter correct amount";
	}
}
