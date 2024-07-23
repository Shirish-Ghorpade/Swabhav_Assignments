package com.aurionpro.model;

public class User {
	private String email;
	private String password;
	public User() {
		this.email = null;
		this.password = null;
	}
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		validateEmail(email);
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		validatePassword(password);
		this.password = password;
	}
	public void validateEmail(String email) {
		if(email == "" || email==null) {
			throw new InvalidEmailException(email);
		}
		String emailRegrex = "^[a-zA-Z0-9.]+@[a-z]+[.][a-z]+$";
		if(!email.matches(emailRegrex)) {
			throw new InvalidEmailException(email);
		}
	}
	public void validatePassword(String password) {
		if(password.length() < 8) {
			throw new InvalidPasswordException(password, "Your password length is less than 8");
		}
		if(!password.matches(".*\\d.*")) {
			throw new InvalidPasswordException(password, "Your password need to contain at least one digit");
		}
		if(!password.matches(".*[a-z].*")) {
			throw new InvalidPasswordException(password, "Your password need to contain at least one small case character");
		}
		if(!password.matches(".*[A-Z].*")) {
			throw new InvalidPasswordException(password, "Your password need to contain at least one upper case character");
		}
		if(!password.matches(".*[!@#$%&*()^].*")) {
			throw new InvalidPasswordException(password, "Your password need to contain at least one symbol");
		}
	}

}
