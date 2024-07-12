package com.aurionpro.iterative.test;

import java.util.Scanner;

public class SimpleATMSimulation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double balance = 1000.00;
		boolean exitOption = false;
		while (!exitOption) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("ATM Menu :");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Exit");
			System.out.println("Please choose an option: "); 
			
			int response = scanner.nextInt();
			switch(response) {
				case 1:
					System.out.println("Your current balance is: $"+ balance);
					break;
				case 2:
					System.out.println("Enter amount to deposit : ");
					double depositAmount = scanner.nextDouble();
					if(depositAmount>0) {
						balance += depositAmount;
						System.out.println("You have deposited "+depositAmount+". Your balance is "+balance);
					}else {
						System.out.println("Invalid deposit amount");
					}
					break;
				case 3:
					System.out.println("Enter amount to withdraw : ");
					double withdrawAmount = scanner.nextDouble();
					if(withdrawAmount>0 && withdrawAmount <= balance) {
						balance -= withdrawAmount;
						System.out.println("You have withdrawl "+withdrawAmount+". Your balance is "+balance);
					}
					else if(withdrawAmount > balance) {
						System.out.println("Insufficient funds");
					}
					else {
						System.out.println("Invalid withdraw amount");
					}
					break;
				case 4:
					exitOption = true;
					System.out.println("Thank You for using ATM. Good Bye!");
					break;
				default:
					System.out.println("Invalid input please select the correct input");
			}
			
		}
		
		

	}

}
