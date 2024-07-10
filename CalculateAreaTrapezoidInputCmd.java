package com.aurionpro.programs;

public class CalculateAreaTrapezoidInputCmd {

	public static void main(String[] args) {
//		Get the first value from command line argument
		Double base1 = Double.parseDouble(args[0]);

//		Get the second value from command line argument
		Double base2 = Double.parseDouble(args[1]);

//		Get the third value from command line argument
		Double height = Double.parseDouble(args[2]);
		
//		Formula of area of trapezoid
		double areaOfTrapezoid = ((base1+base2)/(2*1.0))*height;
		System.out.println("Area of Trapezoid for base "+base1+" and base "+base2+" height is "+height+" is "+areaOfTrapezoid);

	}

}
