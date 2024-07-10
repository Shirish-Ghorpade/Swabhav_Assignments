package com.aurionpro.programs;

import java.util.Scanner;

public class CalculateBodyMassIndexInputScanner {
	
	public static void main(String[] args) {
		
		
//		Take input from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the weight in kilograms");
		double weightInKg = scanner.nextDouble();
		System.out.println("Enter the height in meters");
		double heightInMeters = scanner.nextDouble();
		scanner.close();
		
//		BMI -> Body Mass Index
//		It is formula to calculate BMI
		double BMI = (weightInKg*1.0)/(heightInMeters*heightInMeters);
		System.out.println("The Body Mass Index for a weight of "+weightInKg+"kg and a height of "+heightInMeters+"m is "+BMI);
		
	}
}
