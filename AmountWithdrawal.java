package com.aurionpro.selection.test;

import java.util.Scanner;

public class AmountWithdrawal {

	public static void main(String[] args) {
//		Taking input from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the withdrawal amount: ");
		int amount = scanner.nextInt();
		
//		corner cases
		if(amount > 50000) {
			System.out.println(amount+" exceeds withdrawal limit of 50000");
			return;
		}
		if(amount%100 != 0) {
			System.out.println(amount+" is not a multiple of 100");
			return;
		}
		
//		Quotient of amount/2000 gives the number of denomination 
		int denominationOf2000 = amount/2000;
//		Remainder gives the remaining amount after getting the denomination
		amount %= 2000;
		
		int denominationOf500 = amount/500;
		amount %= 500;
		
		int denominationOf200 = amount/200;
		amount %= 200;
		
		int denominationOf100 = amount/100;
		amount %= 100;
		
		if(denominationOf2000 > 0) {
			System.out.println("Two Thousand : "+denominationOf2000);
		}
		if(denominationOf500 > 0) {
			System.out.println("Five Hundred : "+denominationOf500);
		}
		if(denominationOf200 > 0) {
			System.out.println("Two Hundred : "+denominationOf200);
		}
		if(denominationOf100 > 0) {
			System.out.println("Hundred : "+denominationOf100);
		}

	}

}
