package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.InvalidEmailException;
import com.aurionpro.model.InvalidPasswordException;
import com.aurionpro.model.User;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		User user = new User();

		System.out.println("Enter the email");
		String email = scanner.next();
		
		try {
			user.validateEmail(email);
		} catch (InvalidEmailException exception) {
			// TODO: handle exception
			System.out.println(exception.getMessage());
			return;
		} 
		
		System.out.println("Enter the password");
		String password = scanner.next();
		try{
			user.validatePassword(password);
		}catch (InvalidPasswordException exception) {
			System.out.println(exception.getMessage());
			return;
		}
		System.out.println("You sucessfully entered the email and password !!!!!!!!!!!!!");
	}
}
