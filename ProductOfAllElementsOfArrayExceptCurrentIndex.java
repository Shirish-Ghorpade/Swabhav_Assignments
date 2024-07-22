package com.aurionpro.test;

import java.util.Scanner;

public class ProductOfAllElementsOfArrayExceptCurrentIndex {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		if(size<=0) {
			System.out.println("Size of an array cannot be zero or negative !!!");
			return;
		}
		int array[] = new int[size];
		
		System.out.println("Enter the elements of an array.");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
//		product to store answer
		long product[] = new long[size];
		
		productOfAllElementsOfArrayExceptCurrentIndex(product, array);
//		printing product
		System.out.println("Anwer is ");
		for (int i = 0; i < product.length; i++) {
			System.out.print(product[i]+"\t");
		}
		
	}
	public static void productOfAllElementsOfArrayExceptCurrentIndex(long product[], int[] array) {
		int n=array.length;
		long rightSideProduct[] = new long[n];
		rightSideProduct[n-1]=array[n-1];
		for (int i = n-1; i > 0; i--) {
			rightSideProduct[i-1]=rightSideProduct[i]*array[i-1];
		}
		
		long leftSideProduct=1;
		for (int i = 0; i < n-1; i++) {
			product[i] = leftSideProduct*rightSideProduct[i+1];
			leftSideProduct *= array[i];
		}
		product[n-1]=leftSideProduct;
	}
}
