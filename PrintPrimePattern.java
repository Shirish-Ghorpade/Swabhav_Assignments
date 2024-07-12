package com.aurionpro.iterative.test;

import java.util.Scanner;

public class PrintPrimePattern {
	
	static boolean checkPrime(int number) {
//		for(int i=2; i<number; i++) {
//			if(number%i==0) {
//				return false;
//			}
//		}
//		return true;
		
//////////////		optimum     //////////////////////
//		divisor always exit in pairs. so check upto square root of number
		for(int i=2; i*i<=number; i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int rows = scanner.nextInt();
		
		int number=2;
//		i ---> rows
//		j ---> columns
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				while(!checkPrime(number)) {
					number++;
				}
				System.out.print(number+"\t");
				number++;
			}
			System.out.println();
		}
	}

}
