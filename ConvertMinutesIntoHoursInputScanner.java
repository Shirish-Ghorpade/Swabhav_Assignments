package com.aurionpro.programs;

import java.util.Scanner;

public class ConvertMinutesIntoHoursInputScanner {

	public static void main(String[] args) {
		
//		Taking the input from users
		System.out.println("Enter the Minutes");
		Scanner scanner = new Scanner(System.in);
		int minutes = scanner.nextInt();
		scanner.close();
		
		int minutesPerHour = 60;
		
//		Quotient of minutes/minutesPerHour is hours
		int hours = minutes/minutesPerHour;
//		Remainder of minutes/minutesPerHour is remaining minutes
		int remainingMinutes = minutes%minutesPerHour;
		
		System.out.println(minutes+" minutes is "+hours+" hours and "+remainingMinutes+" minutes");

	}

}
