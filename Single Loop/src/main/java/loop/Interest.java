package loop;

import java.util.*;

public class Interest {
	static Scanner input = new Scanner(System.in);
	
	public static void InterestApproximation() {
		while(true) {
			System.out.print("Enter principal amount: ");
			double principal = input.nextInt();
			
			if(principal == 0) {
				System.out.println("Exit...");
				break;
			}
			
			System.out.print("Enter annual rate: ");
			double annualRate = input.nextInt();
			
			System.out.print("Enter a year: ");
			int year = input.nextInt();
			
			double amount = principal;
			
			for(int a = 1; a <= year; a++) {
				amount += amount * (annualRate / 100); 
			}
			
			double compoundInterest = amount - principal;
			
			System.out.println("\nAfter " + year + " years:");
	        System.out.println("Final amount: " + amount);
	        System.out.println("Compound interest: " + compoundInterest);
		}
	}
	
	public static void SimpleInterest() {
		while(true) {
			System.out.print("Enter principal amount: ");
			double pm = input.nextInt(); //Principal amount
			
			if(pm == 0) {
				System.out.println("Exit...");
				break;
			}
			
			System.out.print("Enter a year: ");
			int y = input.nextInt(); //Year
			
			double r = 0.5 * 100; // rate
			double i = 0; // interest
			
			for(int a = 1; a <= y; a++) { 
				System.out.println("Year " + a + " = " + r + ", Total = " + (r));
				r += pm;
			}
			
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("==== INTEREST FUNCTIONS ====");
			System.out.println("0. Exit <---");
			System.out.println("1. Compute compound interest for N years (approximation).");
			
			System.out.print("Choose a function: ");
			int choice = input.nextInt();
			
			if(choice == 0) {
				System.out.println("Exit...");
				break;
			}else if(choice == 1) {
				InterestApproximation();
			}else if(choice == 2) {
				SimpleInterest();
			}
		}
	}

}
