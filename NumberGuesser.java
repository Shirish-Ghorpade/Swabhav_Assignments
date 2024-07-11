package com.aurionpro.iterative.test;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

	public static void main(String[] args) {
//		Creating Scanner class object 
		Scanner scanner = new Scanner(System.in);
		
//		Creating random class object
		Random random = new Random();
		
//		Boolean used to play track play again choice
		boolean playAgain=true;
		
		while(playAgain) {
//			Random number generated
			int randomGeneratedNumberBySystem = random.nextInt(100)+1;
//			max attempts to guess number
			int maxAttemptsToGuess=5;
//			attempts stores attempts of user
			int attempts=0;
//			To track user win or not
			boolean won=false;
			
//			
			while(attempts<maxAttemptsToGuess) {
//				Take input from user
				System.out.println("Guess a number : ");
				int guessNumber = scanner.nextInt();
//				Increase the attempts
				attempts++;
				
//				User guess right number
				if(randomGeneratedNumberBySystem == guessNumber) {
					System.out.println("You won in attempts : "+attempts+" attempts");
					won=true;
					break;
				}
				else if(randomGeneratedNumberBySystem > guessNumber) {
					System.out.println("Sorry too low");
				}
				else {
					System.out.println("Sorry too high");
				}
			}
//			User win the game
			if(won) {
				System.out.println("Do you want to play game again : yes/no ");
				String choice = scanner.next().toLowerCase();
				
//				User do not want to play again
				if(!choice.equals("yes")) {
					playAgain=false;
					System.out.println("Thank You !!!!");
				}
			}
//			User loose the game
			else {
				System.out.println("Sorry you lost all 5 attempts.");
				break;
			}
		}
		
	}

}
