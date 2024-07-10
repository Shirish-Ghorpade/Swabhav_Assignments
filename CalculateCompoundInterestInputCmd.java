package com.aurionpro.programs;

public class CalculateCompoundInterestInputCmd {

	public static void main(String[] args) {

//		Taking the values from command line arguments
        double principal = Double.parseDouble(args[0]);  
        
        double rateOfInterest = Double.parseDouble(args[1]);     
        
        double time = Double.parseDouble(args[2]);
        
        //Calculate the compound interest
        double compoundInterest = principal * (Math.pow((1 + rateOfInterest / 100), time)); 
        System.out.println("Compound Interest after " + time + " years at rate of "+rateOfInterest+" is "+compoundInterest);

	}

}
