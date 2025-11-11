package loop;

import java.util.Scanner;

public class Average {
	static Scanner input = new Scanner(System.in);
	static int number;
	static double average;
	
	public static void AverageOfNaturalNumbers(double average) {
		int num = 10;
		int sum = 0;
		
		average = num + 1 / 2;
		
		System.out.println("\nThe average of first N natural numbers is: " + average +"\n");
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.print("==== EVERAGE FUNCTIONS ====");
			System.out.println("0. Exit <----");
			System.out.println("1. Find average of first N natural numbers.");
			
			System.out.print("Choose a function: ");
			int choice = input.nextInt();
			
			
			if(choice == 0) {
				System.out.println("Exit...");
				break;
			}else if(choice == 1) {
				AverageOfNaturalNumbers(average);
			}
		}
	}

}
