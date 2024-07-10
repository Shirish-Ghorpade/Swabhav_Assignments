package com.aurionpro.programs;

import java.util.Scanner;

public class DistBetween2PointsInputScanner {

	public static void main(String[] args) {
//		Taken input from users
		System.out.println("Enter the values considering the points representation is (x1,y1) and (x2,y2)");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of x1");
		double x1 = scanner.nextInt();
		System.out.println("Enter the value of y1");
		double y1 = scanner.nextInt();
		System.out.println("Enter the value of x2");
		double x2 = scanner.nextInt();
		System.out.println("Enter the value of y2");
		double y2 = scanner.nextInt();
		scanner.close();
		
//		Formula to calculate distance between two points
		double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
		
		System.out.println("Distance between ("+x1+", "+y1+") and ("+x2+", "+y2+") is "+result);
		
	}

}
