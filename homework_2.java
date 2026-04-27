package Homeworkfiles;

import java.util.Scanner;

public class homework_2 {
		
		
	// Enter work hours
		public static void input_hours(double[][] hours, String[] NAMES, String[] DAYS) {
	        Scanner input = new Scanner(System.in);

	        for (int i = 0; i < NAMES.length; i++) {
	            System.out.println("Enter work hours for " + NAMES[i] + ":");

	            for (int j = 0; j < DAYS.length; j++) {
	                System.out.print(DAYS[j] + ": ");
	                hours[i][j] = input.nextDouble();
	            }
	        }
	    }

	    // 2) Display all work hours
	    public static void display_hours(double[][] hours, String[] NAMES, String[] DAYS) {
	        System.out.println("\nWeekly Work Hours:");

	        System.out.print("    ");
	        for (String day : DAYS) {
	            System.out.print(day + "    ");
	        }
	        System.out.print('\n');
	        System.out.println("-------------------------------------------");

	        for (int i = 0; i < NAMES.length; i++) {
	            System.out.print(NAMES[i] + "    ");

	            for (int j = 0; j < DAYS.length; j++) {
	                System.out.print(hours[i][j] + "    ");
	            }
	            System.out.println();
	        }
	    }

	    // 3) Compute the total hours
	    public static double totalHours(double[][] hours, String[] NAMES, String[] DAYS) {
	        double total = 0;

	        for (int i = 0; i < hours.length; i++) {
	            for (int j = 0; j < hours[i].length; j++) {
	                total += hours[i][j];
	            }
	        }

	        return total;
	    }

	    // 4) Show total hours by each employee
	    public static void totalHoursByEmployee(double[][] hours, String[] NAMES, String[] DAYS) {
	        System.out.println("\nTotal Hours by Each Employee:");

	        for (int i = 0; i < NAMES.length; i++) {
	            double sum = 0;

	            for (int j = 0; j < DAYS.length; j++) {
	                sum += hours[i][j];
	            }

	            System.out.println(NAMES[i] + ": " + sum + " hours");
	        }
	    }
	public static void main(String[] args) {
			String[] NAMES ={"Tom", "Jane", "Mark"};
			String[] DAYS ={"MON", "TUE","WED", "THU", "FRI"};
			
			double[][] hours = new double[NAMES.length][DAYS.length];
			System.out.println("Homework2 by Azlan Roshan");
			
			input_hours(hours, NAMES, DAYS);
			
			display_hours(hours,NAMES,DAYS);
			
			System.out.println("------------------------------");
			
			System.out.println("Total hours : " + totalHours(hours,NAMES, DAYS));
			
			System.out.println("------------------------------");
			
			totalHoursByEmployee(hours,NAMES,DAYS);

	}

}
