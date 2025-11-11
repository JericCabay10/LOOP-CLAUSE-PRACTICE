package loop;

import java.util.*;

public class Count {
	static Scanner input = new Scanner(System.in);
	static int number;
	
	public static void CountDigitNumbers(int num) {
		while(true) {
			System.out.print("Enter digits: ");
			num = input.nextInt();
			
			if(num == 0) {
				System.out.println("Exit...");
				break;
			}
			
			int count = 0;
			while(num != 0) {
				int digit = num % 10;
				count++;
				num /= 10;
			}
			System.out.println("Count of the digit is: " + count);
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.print("==== COUNT FUNCTIONS ====");
			System.out.println("0. Exit <---");
			System.out.println("1. Count number of digits in a number.");
			
			System.out.print("Choice a function: ");
			int choice = input.nextInt();
			
			if(choice == 0) {
				System.out.println("Exit...");
				break;
			}else if(choice == 1) {
				CountDigitNumbers(number);
			}
			
			
		}
	}
}
