package com.aurionpro.test;

import java.util.Scanner;

public class MultiplicationOfTwoMatrix {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the data of first matrix");
		int matrix1[][] = creatingMatrix(scanner);
		if(matrix1==null) {
			return;
		}
		System.out.println("matrix 1 : ");
		printingMatrix(matrix1);
		
		System.out.println("Enter the data of second matrix");
		int matrix2[][] = creatingMatrix(scanner);
		if(matrix2==null) {
			return;
		}
		System.out.println("Matrix 2 : ");
		 printingMatrix(matrix2);

		 
		if (matrix1[0].length != matrix2.length) {
			System.out.println("Invalid matrices for multilplication !! try again. ");
			System.out.println("As per multiplication rules column of first matrix should be matched with row of second matrix");
			return;
		}
		
		int ans[][] = new int[matrix1.length][matrix2[0].length];
		multiplicationOfMatrix(matrix1, matrix2, ans);
		System.out.println("-------------------------------------------------");
		System.out.println("Answer of matrix multiplication : ");
		printingMatrix(ans);

	}

	private static int[][] creatingMatrix(Scanner scanner) {

		System.out.println("Enter the number of rows : ");
		int rows = scanner.nextInt();
		if(rows<=0) {
			System.out.println("Rows cannot be zero or negative");
			return null;
		}
		
		System.out.println("Enter the number of columns : ");
		int cols = scanner.nextInt();
		if(cols<=0) {
			System.out.println("Columns cannot be zero or negative");
			return null;
		}
		int matrix[][] = new int[rows][cols];

		System.out.println("Enter the elements of matrix : ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		return matrix;
	}

	private static void printingMatrix(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static void multiplicationOfMatrix(int matrix1[][], int matrix2[][], int ans[][]) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				int sum = 0;
				for (int k = 0; k < matrix1[0].length; k++) {
					sum += matrix1[i][k] * matrix2[k][j];
				}
				ans[i][j] = sum;
			}
		}
	}
}
