package com.aurionpro.selection.test;

import java.util.Scanner;

public class TreasureIsland {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Treasure Island.");
        
//        Taking input from user
//        Step 1: left or right
        System.out.println("Enter the option");
        System.out.println("1. Left");
        System.out.println("2. Right");
        int response1 = scanner.nextInt();
        
        if (response1 == 1) {
//             Step 2: Swim or wait?
        	System.out.println("Enter the option");
            System.out.println("1. Swim");
            System.out.println("2. Wait");
            int response2 = scanner.nextInt();

            if (response2==2) {
                // Step 3: Which door?
                System.out.println("Which door? Red, Blue or Yellow?");
                System.out.println("Enter the option");
                System.out.println("1. Red");
                System.out.println("2. Blue");
                System.out.println("3. Yellow");
                int response3 = scanner.nextInt();

                if (response3==1) {
                    System.out.println("Burned by fire. Game Over.");
                } 
                else if (response3==2) {
                    System.out.println("Eaten by beasts. Game Over.");
                } 
                else if (response3==3) {
                    System.out.println("You Win!");
                } 
                else {
                    System.out.println("Game Over.");
                }
            } 
            else {
                System.out.println("Attacked by trout. Game Over.");
            }
        } 
        else {
            System.out.println("Fall into a hole. Game Over.");
        }

	}

}
