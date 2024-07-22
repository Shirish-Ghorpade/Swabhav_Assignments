package com.aurionpro.test;

import java.util.Scanner;

public class SecondLargestElementOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		if (size <= 0) {
			System.out.println("Size of array cannot be zero or negative");
			return;
		}
		int array[] = new int[size];

		System.out.println("Enter the elements of an array");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("The second largest value is " + findSecondLargestElement(array));
	}
	public static int findSecondLargestElement(int array[]) {
		int firstLargestElement = array[0];
		int secondLargestElement = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > firstLargestElement) {
				secondLargestElement = firstLargestElement;
				firstLargestElement = array[i];
			} else if (validForSecondLargest(array[i], firstLargestElement, secondLargestElement)) {
				secondLargestElement = array[i];
			}
		}
		return secondLargestElement;
	}
	public static boolean validForSecondLargest(int currentArrayElement, int firstLargestElement, int secondLargestElement) {
		if(currentArrayElement != firstLargestElement
					&& (secondLargestElement == -1 || currentArrayElement > secondLargestElement)) {
			return true;
		}
		return false;
	}

}
