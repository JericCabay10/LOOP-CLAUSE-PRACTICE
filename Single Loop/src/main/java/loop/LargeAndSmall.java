package loop;

import java.util.*;

public class LargeAndSmall {
	static Scanner input = new Scanner(System.in);
	static int num;
	
	public static void FindTheLargestInDigit() {
		while(true) {
			System.out.print("Enter a digit: ");
			int digit = input.nextInt();
			
			int original = num;
			
			if(digit == 0) {
				System.out.println("Exit...");
				break;
			}else if(digit <= 99) {
				System.out.println("Enter at least 3 digit");
			}else {
				int large = 0;
				while(digit != 0) {
					int num = digit % 10;
					if(num >= large) {
						large = num;
					}
					digit /= 10;
				}
				System.out.println("The large number in digit " + original + " is " + large);
			}
		}
	}
	
	public static void FindTheSmallerIndigit() {
		while(true) {
			System.out.print("Enter a digit: ");
			int digit = input.nextInt();
			
			int original = digit;
			int smaller = 0;
			
			if(digit == 0) {
				System.out.println("Exit...");
				break;
			}else if(digit <= 99) {
				System.out.println("Enter at least 3 digits");
			}else {
				while(digit != 0) {
					int num = digit % 10;
					if(num <= smaller) {
						smaller = num;
					}
					digit /= 10;
				}
				System.out.println("The large number in digit " + original + " is " + smaller);
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("==== FIND FUNCTIONS ====");
			System.out.println("0. Exit <---");
			System.out.println("1. Find the largest digit in a number.");
			System.out.println("2. Find the smallest digit in a number.");
			
			System.out.print("Choose a function: ");
			int choice = input.nextInt();
			
			if(choice == 0) {
				System.out.println("Exit...");
				break;
			}else if(choice == 1) {
				FindTheLargestInDigit();
			}else if(choice == 2) {
				FindTheSmallerIndigit();
			}
			
			
		}
	}

}
