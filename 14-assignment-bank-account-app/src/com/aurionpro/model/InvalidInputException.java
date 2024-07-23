package com.aurionpro.model;

public class InvalidInputException extends RuntimeException{
	private int response;
	
	public InvalidInputException(int response) {
		super();
		this.response = response;
	}

	public int getResponse() {
		return response;
	}

	public void setResponse(int response) {
		this.response = response;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "You entered response as "+response+" which is invalid. Please enter valid response";
	}
	
}
