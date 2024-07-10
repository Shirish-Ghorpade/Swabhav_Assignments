package com.aurionpro.programs;

public class DistBetween2pointsInputCmd {

	public static void main(String[] args) {
//		Take the values from command line arguments
		double x1 = Double.parseDouble(args[0]);
		double y1 = Double.parseDouble(args[1]);
		double x2 = Double.parseDouble(args[2]);
		double y2 = Double.parseDouble(args[3]);
		
//		Formula to calculate distance between two points
		double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
		
		System.out.println("Distance between ("+x1+", "+y1+") and ("+x2+", "+y2+") is "+result);

	}
}
