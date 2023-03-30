package com.bridgelabz.employeewageprograms;

import java.util.Scanner;

public class EmployeeWageProgram {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static int computeEmpwage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		
		//variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		
		//Computation
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
				default:
					empHrs = 8;
					
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + "Emp Hr: " +empHrs);
		}
		int totalEmpwage = totalEmpHrs + empRatePerHour;
		System.out.println("Total Emp wage for Company: " +company+" is: "+ totalEmpwage);
		return totalEmpwage;
	}
	public static void main(String[] args) {
		computeEmpwage("DMart", 20, 2, 10);
		computeEmpwage("Reliance", 10, 4, 20);
	}
}
	