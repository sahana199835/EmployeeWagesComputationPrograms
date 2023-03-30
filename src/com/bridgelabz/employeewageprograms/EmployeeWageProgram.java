package com.bridgelabz.employeewageprograms;

import java.util.Scanner;

public class EmployeeWageProgram {

	public static final int WAGE_PER_Hour = 20;
	public static final int FULL_DAY_HOUR = 8;
	public static final int PART_TIME_HOUR = 4;
	public static final int WORKING_DAYS_PER_MONTH = 20;
	public static int HOURS_WORKED;
	public static int DAILY_WAGE = 0;
	public static final int MONTHLY_WAGE = 0;

	public static void emoloyeeWageComputation() {

		Scanner sc = new Scanner(System.in);
		int MONTHLY_WAGE = 0;

		for (int i = 1; i <= WORKING_DAYS_PER_MONTH; i++) {
			System.out.println("Enter the hours worked on day " + i + ": ");
			HOURS_WORKED = sc.nextInt();

			switch (HOURS_WORKED) {
			case 8:
				DAILY_WAGE = WAGE_PER_Hour * DAILY_WAGE;
				break;
			case 4:
				DAILY_WAGE = WAGE_PER_Hour * PART_TIME_HOUR;
				break;
			default:
				System.out.println("Invalid hours worked");
				break;
			}

			MONTHLY_WAGE += DAILY_WAGE;
		}

		System.out.println("Monthly employee wage: $" + MONTHLY_WAGE);
		sc.close();
	}

	public static void main(String[] args) {

		emoloyeeWageComputation();
	}
}
