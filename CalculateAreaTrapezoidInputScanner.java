package com.aurionpro.programs;

import java.util.Scanner;

public class CalculateAreaTrapezoidInputScanner {

	public static void main(String[] args) {
		
//		Taking the input from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of first base");
		Double base1 = scanner.nextDouble();
		System.out.println("Enter the length of second base");
		Double base2 = scanner.nextDouble();
		System.out.println("Enter the height");
		Double height = scanner.nextDouble();
		scanner.close();
		
//		Formula of area of trapezoid
		double areaOfTrapezoid = ((base1+base2)/(2*1.0))*height;
//		Printing the area
		System.out.println("Area of Trapezoid for base "+base1+" and base "+base2+" height is "+height+" is "+areaOfTrapezoid);

	}

}
