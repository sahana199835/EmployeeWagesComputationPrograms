package com.bridgelabz.employeewageprograms;

import java.util.Scanner;
public class EmployeeWageProgram {

	public static void main(String[] args) {
		
		 int wagePerHour = 20;
	        int fullDayHour = 8;
	        int partTimeHour = 4;
	        int workingDaysPerMonth = 20;
	        int maxWorkingDays = 20;
	        int maxWorkingHours = 100;

	        Scanner input = new Scanner(System.in);
	        int hoursWorked;
	        int dailyWage = 0;
	        int monthlyWage = 0;
	        int totalWorkingHours = 0;
	        int totalWorkingDays = 0;

	        while (totalWorkingHours < maxWorkingHours && totalWorkingDays < maxWorkingDays){
	            System.out.println("Enter the hours worked on day " + (totalWorkingDays + 1) + ": ");
	            hoursWorked = input.nextInt();

	            switch(hoursWorked) {
	                case 8:
	                    dailyWage = wagePerHour * fullDayHour;
	                    break;
	                case 4:
	                    dailyWage = wagePerHour * partTimeHour;
	                    break;
	                default:
	                    System.out.println("Invalid hours worked");
	                    break;
	            }

	            monthlyWage += dailyWage;
	            totalWorkingHours += hoursWorked;
	            totalWorkingDays++;
	        }

	        System.out.println("Total employee wage: $" + monthlyWage);
	        System.out.println("Total working hours: " + totalWorkingHours);
	        System.out.println("Total working days: " + totalWorkingDays);

	        input.close();
	}

}

        



