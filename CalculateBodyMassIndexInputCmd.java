package com.aurionpro.programs;


public class CalculateBodyMassIndexInputCmd {

	public static void main(String[] args) {
		
//		Take input from command line arguments
		double weightInKg = Double.parseDouble(args[0]);
		double heightInMeters = Double.parseDouble(args[1]);
		
//		BMI -> Body Mass Index
//		Formula to calculate BMI
		double BMI = (weightInKg*1.0)/(heightInMeters*heightInMeters);
		System.out.println("The Body Mass Index for a weight of "+weightInKg+"kg and a height of "+heightInMeters+"m is "+BMI);
		
	}

}
