package com.bridgelabz.employeewageprograms;

public class EmployeeWageProgram {

	public static void main(String[] args) {
		
		int employeewageperhour = 20;
		int fulldayhours = 8;
		int parttime = 4;
		 int dailywage =0;
		 int hours = 4;
		 switch (hours) {
            case 8:
                dailywage = employeewageperhour * fulldayhours;
                System.out.println("Employee fullday salary" +dailywage);
                break;
            case 4:
                dailywage = employeewageperhour * parttime;
                System.out.println("Employee parttime salary" +dailywage);
                break;
            default:
                System.out.println("Employee is Absent");
                break;
        } 
	        System.out.println("Total salary: " +dailywage);


	}

}
	


