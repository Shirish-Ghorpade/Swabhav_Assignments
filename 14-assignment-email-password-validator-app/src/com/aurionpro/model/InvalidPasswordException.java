package com.aurionpro.model;

public class InvalidPasswordException extends RuntimeException {
	private String password;
	private String message;

	public InvalidPasswordException(String password, String message) {
		super();
		this.password = password;
		this.message = message;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Invalid password. "+message+". "
				+ "Please enter the password which contains at least one upper case, at least one lower case, at least one digit and at least one special character";
	}
	
}
