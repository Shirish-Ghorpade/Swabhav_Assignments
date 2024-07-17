package com.aurionpro.iterative.test;

import java.util.Random;
import java.util.Scanner;

public class PIGDiceGame {

	public static void main(String[] args) {
//		Creating object of scanner class
		Scanner scanner = new Scanner(System.in);
		
//		creating object of random class
		Random random = new Random();
		
//		keep track of total score
		int finalScore=0;
//		keep track of turn number
		int turn=1;
	
		
		while(finalScore<20) {
//			turn score is zero at start
			int turnScore=0;
			boolean turnEnded = false;
			System.out.println("TURN "+turn);
			while (!turnEnded) {
//				finalScore is greater than or equal to 20 then break. You win!!!! 
				if(finalScore+turnScore>=20) {
					break;
				}
				System.out.println("Roll or Hold ? (r/h) ");
				String choice = scanner.next().toLowerCase();
//				User choose roll
				if(choice.equals("r")) {
					int randomGeneratedNumberBySystem = random.nextInt(6)+1;
					System.out.println("Die "+randomGeneratedNumberBySystem);
		
					if(randomGeneratedNumberBySystem ==1) {
						turnScore=0;
						turnEnded = true;
						System.out.println("Turn Over. No score");
						System.out.println("Total score is "+finalScore);
					}
					else {
//					Die Score (randomGeneratedNumberBySystem) added in turn score
						turnScore += randomGeneratedNumberBySystem;
					}
				}
//				User choose hold
				else if(choice.equals("h")) {
//					turn is ended
					turnEnded=true;
//					turn score and final score is printed 
					System.out.println("Score for turn : "+turnScore);
					System.out.println("Total Score : "+(finalScore+turnScore));
					System.out.println("--------------------------------------------");
				}
				else {
//					handle invalid case
					System.out.println("Invalid choice. Please select r or h only");
				}
			}
			finalScore += turnScore;
			turn++;
		}
		System.out.println("You Finished in "+(turn-1)+ " turns!");
		System.out.println("Game Over!");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
	}

}
