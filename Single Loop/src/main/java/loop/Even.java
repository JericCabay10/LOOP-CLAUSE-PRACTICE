package loop;

import java.util.*;

public class Even {
	static Scanner input = new Scanner(System.in);
	static int number;
	
	public static void EvenNumber(int num) {
		num = 20;
		
		for(int a = 2; a <= num; a += 2) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
	
	public static void FirstNEvenNumbers(int num) {
		num = 10;
		
		for(int a = 1; a <= num; a++) {
			System.out.print((2 * a) + " ");
		}
		System.out.println();
	}
	
	public static void SumAllEvenDigitNumbers(int digit) {
		digit = 123456789;
		int sum = 0;
		
		System.out.println("digit = " + digit);
		while(digit != 0) {
			int num = digit % 10;
			if(num % 2 == 0) {
				sum += num;
			}
			digit /= 10;
		}
		
		System.out.println("The Sum of even digit number is: " + sum);
	}
	
	public static void CountEvenInDigitNumbers() {
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
				if(num % 2 == 0) {
					count++;
				}
				digit /= 10;
			}
			System.out.println("Count of even in digit in " + original + " is " + count);
		}
	}
	
	public static void SumOfEvenNumbers(int num) {
		while(true) {
			System.out.print("\nEnter the N term: ");
			num = input.nextInt();
			
			int sum = 0;
			
			for(int a = 1; a <= num; a++) {
				if(a % 2 == 0) {
					sum += a;
				}
			}
			System.out.println("Sum Of even numbers from 1 to N term is: " + sum);
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("\n==== PRINT SIMPLE ====");
			System.out.println("0. Exit System or Function");
			System.out.println("1. Print even numbers from 1 to 20.");
			System.out.println("2. Print first N even numbers.");
			System.out.println("3. Find sum of all even digits in a number.");
			System.out.println("4. Count number of even digits in a number.");
			System.out.println("5. Find the sum of even numbers from 1 to N.");
		
			System.out.print("Choose a function: ");
			int choice = input.nextInt();
			System.out.println();
			
			if(choice == 0) {
				System.out.println("Exit Function...");
				break;
			}else if(choice == 1) {
				EvenNumber(number);
			}else if(choice == 2) {
				FirstNEvenNumbers(number);
			}else if(choice == 3) {
				SumAllEvenDigitNumbers(number);
			}else if(choice == 4) {
				CountEvenInDigitNumbers();
			}else if(choice == 5) {
				SumOfEvenNumbers(number);
			}
		}
	}
}
