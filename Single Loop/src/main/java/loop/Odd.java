package loop;

import java.util.*;

public class Odd {
	static Scanner input = new Scanner(System.in);
	static int number;
	
	public static void OddNumber(int num) {
		num = 20;
		
		for(int a = 1; a <= num; a += 2) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
	
	public static void FirstNOddNumbers(int num) {
		num = 10;
		
		for(int a = 1; a <= num; a++) {
			System.out.print((2 * a - 1) + " ");
		}
		System.out.println();
	}
	
	public static void SumAllOddDigitNumbers(int digit) {
		digit = 123456789;
		int sum = 0;
		
		System.out.println("digit = " + digit);
		while(digit != 0) {
			int num = digit % 10;
			if(num % 2 == 1) {
				sum += num;
			}
			digit /= 10;
		}
		System.out.println("The Sum of odd digit number is: " + sum);
	}
	
	public static void CountOfOddInDigitNumbers() {
		while(true) {
			System.out.print("Enter a digit at least 3 or more: ");
			int digit = input.nextInt();
			int original = digit;
			int count = 0;
			
			if(digit == 0) {
				System.out.println("Exit...");
				break;
			}
			
			while(digit != 0) {
				int num = digit % 10;
				if(num % 2 == 1) {
					count++;
				}
				digit /= 10;
			}
			System.out.println("Count of odd in digit in " + original + " is " + count);
		}
	}

	public static void SumOfOddNumbers(int num) {
		while(true) {
			System.out.print("\nEnter the n term: ");
			num = input.nextInt();
			int sum = 0;
			
			for(int a = 1; a <= num; a++) {
				if(a % 2 == 1) {
					sum += a;
				}
			}
			System.out.println("Sum Of odd numbers from 1 to N term is: " + sum);
		}
	}
	
	public static void SumOfOddFrom10to30(int sum) {
		
		for(int a = 10; a <= 30; a++) {
			if(a % 2 == 1) {
				sum += a;
			}
		}
		System.out.println("Sum of odd from 10 to 30 is: " + sum);
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("\n==== PRINT SIMPLE ====");
			System.out.println("0. Exit System or Function");
			System.out.println("1. Print odd numbers from 1 to 20.");
			System.out.println("2. Print first N odd numbers.");
			System.out.println("3. Find sum of all odd digits in a number.");
			System.out.println("4. Count number of odd digits in a number.");
			System.out.println("5. Find the sum of odd numbers from 1 to N.");
			System.out.println("6. Find sum of all odd numbers between 10 and 30.");
		
			System.out.print("Choose a function: ");
			int choice = input.nextInt();
			System.out.println();
			
			if(choice == 0) {
				System.out.println("Exit Function...");
				break;
			}else if(choice == 1) {
				OddNumber(number);
			}else if(choice == 2) {
				FirstNOddNumbers(number);
			}else if(choice == 3) {
				SumAllOddDigitNumbers(number);
			}else if(choice == 4) {
				CountOfOddInDigitNumbers();
			}else if(choice == 5) {
				SumOfOddNumbers(number);
			}else if(choice == 6) {
				SumOfOddFrom10to30(number);
			}
		}
	}
}
