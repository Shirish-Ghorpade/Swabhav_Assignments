package com.aurionpro.model;

public class OverDraftLimitExceedsException extends RuntimeException{
	private double amount;
	private double balance;
	private double OVER_DRAFT_LIMIT;
	public OverDraftLimitExceedsException(double amount, double balance, double OVER_DRAFT_LIMIT) {
		super();
		this.amount = amount;
		this.balance = balance;
		this.OVER_DRAFT_LIMIT = OVER_DRAFT_LIMIT;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "You entered amount "+ amount+" which is greater than balance of your account "+balance +"and also exceeds the over draft limit "+OVER_DRAFT_LIMIT+". Please enter smaller amount";
	}
}
