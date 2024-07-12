package com.aurionpro.iterative.test;

import java.util.Random;
import java.util.Scanner;

public class WordGuessGame {

	public static void main(String[] args) {
		String[] words = {"apple","banana","orange","grape","strawberry","kiwi","blueberry","raspberry","mango","pineapple","watermelon","peach","plum",
				"cherry","pear","apricot","blackberry","nectarine","pomegranate","coconut"};

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
//		Choose random word from words array
		int randomNumber = random.nextInt(words.length);
		String randomSelectedWord = words[randomNumber];
		
		int length=randomSelectedWord.length();
		
//		Create array to store the input from user
		char[] userInput = new char[length];
		
//		Fill it with the _
		for(int i=0; i<length; i++) {
			userInput[i] = '_';
		}
//		lives is equal to 3 times of random SelectedWord
		int lives = length*3;
		
		
		while(true) {
//			Print the array of userInput to see the with letters need to be guessed.
			System.out.println("Word : " + String.valueOf(userInput));
			
			
			System.out.println("Guess a letter : ");
			char guess = scanner.next().charAt(0);
			
			
//			Check guess letter is present in the random selected word
			if(randomSelectedWord.indexOf(guess) >= 0) {
//				Fill that guess letter in userInput array
				for(int i=0; i<randomSelectedWord.length(); i++) {
					if(randomSelectedWord.charAt(i)==guess) {
						userInput[i] = guess;
					}
				}
//				UserInput is equal to random selected word the you win
				if(String.valueOf(userInput).equals(randomSelectedWord)) {
					System.out.println("You win the game !!!. word is "+randomSelectedWord);
					break;
				}
			}
//			guess letter is not found in the randomSelected word
			else {
				lives--;
//				Lives finished then game over
				if(lives == 0) {
					System.out.println("Game over. The word was "+randomSelectedWord);
					break;
				}
//				Guess wrong letter
				System.out.println("Incorrect guess. Guess again!!!!");
			}
			
		}
	}
}
