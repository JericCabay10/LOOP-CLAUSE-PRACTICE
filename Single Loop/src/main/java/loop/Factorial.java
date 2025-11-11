package loop;

import java.util.Scanner;

public class Factorial {
	static Scanner input = new Scanner(System.in);
	static int number;
	
	public static void FindTheFactorial(int num) {
		while(true) {
			System.out.print("\nEnter a number: ");
			num = input.nextInt();
			int factorial = 1;
			
			if(num == 0) {
				System.out.println("Exit...");
				break;
			}
			
			for(int a = 1; a <= num; a++) {
				factorial *= a;
			}
			
			System.out.print("The factorial of " + num + " is: " + factorial);
			System.out.println();
		}
	}
	
	public static void FindTheSumOfFactorial() {
		while(true) {
			System.out.print("\nEnter a number: ");
			int num = input.nextInt();

			
			if(num == 0) {
				System.out.println("Exit...");
				break;
			}
			
			int factorial = 1;
			for(int a = 1; a <= num; a++) {
				factorial *= a;
			}
			
			int temp = factorial;
			int sum = 0;
			while(temp != 0) {
				int digit = temp % 10;
				sum += digit;
				temp /= 10;
			}
			
			System.out.println("\nThe factorial of " + num + " is: " + factorial);
			System.out.println("The sum of factorial  " + factorial + " is: " + sum);
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.print("==== FACTORIAL FUNCTIONS ====");
			System.out.println("0. Exit <---");
			System.out.println("1. Find factorial of a number.");
			System.out.println("2. Find sum of factorials of digits.");
				
			System.out.print("Choose a function: ");
			int choice = input.nextInt();
					
			if(choice == 0) {
				System.out.println("Exit...");
				break;
			}else if(choice == 1) {
				FindTheFactorial(number);
			}else if(choice == 2) {
				FindTheSumOfFactorial();
			}
		}

	}

}
