package com.aurionpro.programs;


public class CalculateMinutesIntoHoursInputCmd {

	public static void main(String[] args) {
//		Taking values from command line arguments
		int minutes = Integer.parseInt(args[0]);
		
		int minutesPerHour = 60;
		
//		Quotient of minutes/minutesPerHour is hours
		int hours = minutes/minutesPerHour;
//		Remainder of minutes/minutesPerHour is remaining minutes
		int remainingMinutes = minutes%minutesPerHour;
		
		System.out.println(minutes+" minutes is "+hours+" hours and "+remainingMinutes+" minutes");

	}

}
