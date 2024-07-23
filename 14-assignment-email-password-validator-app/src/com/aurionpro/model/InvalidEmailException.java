package com.aurionpro.model;

public class InvalidEmailException extends RuntimeException{
	private String email;
	
	public InvalidEmailException(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "You entered email "+email+" is not valid. Please enter valid email address";
	}
	
}
