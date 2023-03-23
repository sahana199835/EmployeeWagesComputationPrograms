package com.bridgelabz.employeewageprograms;

import java.util.Scanner;
public class EmployeeWageProgram {

	public static void main(String[] args) {
		
		int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int workingDaysPerMonth = 20;

        Scanner sc = new Scanner(System.in);
        int hoursWorked;
        int dailyWage = 0;
        int monthlyWage = 0;

        for (int i = 1; i <= workingDaysPerMonth; i++) {
            System.out.println("Enter the hours worked on day " + i + ": ");
            hoursWorked = sc.nextInt();

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
        }

        System.out.println("Monthly employee wage: $" + monthlyWage);
        sc.close();
	    }
	}



