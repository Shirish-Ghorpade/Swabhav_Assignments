package com.aurionpro.test;

import java.util.Scanner;

public class SortSquaresOfSortedArray {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		if(size<=0) {
			System.out.println("Size of array cannot be zero or negative");
			return;
		}
		int array[] = new int[size];
		
		System.out.println("Enter the elements of an array. Please enter the sorted array !!!!");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		
		int answer[] = new int[size];
		int ptr=size-1;
		int left=0, right=size-1;
		
		while (left<=right) {
			int squareOfLeftEle = array[left]*array[left];
			int squareOfRightEle = array[right]*array[right];
			
			if(squareOfLeftEle>squareOfRightEle) {
				answer[ptr--] = squareOfLeftEle;
				left++;
			}
			else if((squareOfLeftEle<squareOfRightEle) || (squareOfLeftEle==squareOfRightEle)){
				answer[ptr--] = squareOfRightEle;
				right--;
			}
		}
		System.out.println("Sorted Array");
		for (int i = 0; i < size; i++) {
			System.out.print(answer[i]+"\t");
		}
	
	}

}
