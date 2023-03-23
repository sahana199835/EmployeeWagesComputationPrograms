package com.bridgelabz.employeewageprograms;

public class EmployeeWageProgram {

	public static void main(String[] args) {
		
		 int employeewageperhour = 20;
		  int fulldayhours = 8;
		  int parttime = 4;
		  int dailywage = 0;
		 double empcheck = Math.floor(Math.random() * 10) %2;


		 if (empcheck == 1) 
				 {
			       dailywage = employeewageperhour * fulldayhours;
	               System.out.println("Employee is working as  fullday");
				 }
		 else 
		 {
	              dailywage = employeewageperhour * parttime;
	              System.out.println("Employee is Part Time");
	     }
	              System.out.println("Daily Employee Wage: " + dailywage);
	  }
	}



	


