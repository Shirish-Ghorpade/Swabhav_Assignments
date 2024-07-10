package com.aurionpro.programs;

import java.util.Scanner;

public class CalculateCompoundInterestInputScanner {

	public static void main(String[] args) {
	
		//Take input from the user
    	Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Principal : ");
        double principal = scanner.nextDouble();   
        System.out.println("Enter the Rate of interest : ");
        double rateOfInterest = scanner.nextDouble();     
        System.out.println("Enter the Time period in years: ");
        double time = scanner.nextDouble();      
        scanner.close();
        
        //Calculate the compound interest
        double compoundInterest = principal * (Math.pow((1 + rateOfInterest / 100), time)); 
        System.out.println("Compound Interest after " + time + " years at rate of "+rateOfInterest+" is "+compoundInterest);

	}

}
