package com.aurionpro.selection.test;

import java.util.Scanner;

public class RideBillCalculator {

	public static void main(String[] args) {
//		Taking input from user
		Scanner scanner = new Scanner(System.in);
//		STEP 1 : Enter height
		System.out.println("Enter the height in centimeter");
		int height = scanner.nextInt();
		
//		Make variable to track bill
		int bill=0;
		if(height>120) {
			System.out.println("Can ride");
			
//			STEP 2 : Enter age
			System.out.println("Enter the age in years");
			int age = scanner.nextInt();
			
			if(age<12) {
				bill += 5;
			}
			else if(age>=12 && age<=18) {
				bill += 7;
			}
			else if(age>=45 && age<=55) {
				bill += 0;
			}
			else if(age>=18){
				bill += 12;
			}
			
//			STEP 3 : Enter choice yes/no
			System.out.println("Want photos ?");
			System.out.println("Enter the option");
			System.out.println("1. Yes");
			System.out.println("2. No");
			int response = scanner.nextInt();
			
//			Response yes than add 3 in bill
			if(response == 1) {
				bill += 3;
			}
			System.out.println("Total bill is "+bill+"$");
		}
		else {
			System.out.println("Can't ride because your height is "+height+"cm which is less than or equal to 120cm");
		}
		
	}

}
