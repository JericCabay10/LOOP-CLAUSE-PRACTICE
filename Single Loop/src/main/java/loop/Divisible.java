package loop;

import java.util.*;

public class Divisible {
	static Scanner input = new Scanner(System.in);
	static int number;
	
	public static void DivisibleByFive(int num) {
		num = 50;
		
		for(int a = 5; a <= num; a += 5) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
	
	public static void SkippingDivisibleOfThree(int num) {
		num = 100;
		
		for(int a = 1; a <= num; a++) {
			if(a % 3 != 0) {
				System.out.print(a + " ");
			}
		}
		System.out.println();
	}
	
	public static void PrintEveryThirdNumber(int num) {
		num = 30;
		
		for(int a = 1; a <= num; a++) {
			if(a % 3 == 0) {
				System.out.print(a + " ");
			}
		}
		System.out.println();
	}
	
	public static void DivisibleBy7In50And100(int num) {
		num = 100;
		
		for(int a = 50; a <= num; a++) {
			if(a % 7 == 0) {
				System.out.print(a + " ");
			}
		}
		System.out.println();
	}
	
	public static void DivisibleBy2() {
		for(int a = 1; a <= 20; a++) {
			if(a % 2 == 0) {
				System.out.print(a + " ");
			}
		}
		System.out.println();
	}
	
	public static void SumOfDivisibleBy5(int sum) {
		for(int a = 1; a <= 100; a++) {
			if(a % 5 == 0) {
				sum += a;
			}
		}
		System.out.println("Sum all number divisible by 5: " + sum);
	}
	
	public static void SumOfAllDivisibleBy3(int num) {
		num = 100;
		int sum = 0;
		for(int a = 1; a <= num; a++) {
			if(a % 3 == 0) {
				sum += a;
			}
		}
		System.out.println("The sum of Divisible by 3 in 1 to 100 is: " + sum);
	}
	
	public static void SumOfNaturalDivisibleBy4(int num) {
		while(true) {
			System.out.print("\nEnter a number: ");
			num = input.nextInt();
			int multiple = 0;
			int sum = 0;
			
			if(num == 0) {
				System.out.println("Exit...");
				break;
			}
			
			for(int a = 1; a <= num; a++) {
				multiple = 4 * a;
				sum += multiple;
			}
			System.out.println("The sum of first N multiples of 4 is: " + sum);
		}
	}
	
	public static void SumOfDivisibleBy2and3() {
		int num = 50;
		int sum = 0;
		
		for(int a = 1; a < num; a++) {
			if(a % 2 == 0 && a % 3 == 0) {
				System.out.print(a + ", ");
				sum += a;
			}
		}
		System.out.println("\nThe sum of numbers divisible by 2 and 3 up to 50 is: " + sum);
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("\n==== PRINT SIMPLE ====");
			System.out.println("0. Exit System or Function");
			System.out.println("1. Print multiples of 5 up to 50.");
			System.out.println("2. Print numbers from 1 to 100 skipping multiples of 3.");
			System.out.println("3. Print every 3rd number from 1 to 30.");
			System.out.println("4. Print numbers between 50 and 100 that are divisible by 7.");
			System.out.println("5. Print every second number from 2 to 20.");
			System.out.println("6. Find sum of numbers divisible by 5 between 1 and 100.");
			System.out.println("7. Find the sum of all numbers divisible by 3 up to 100.");
			System.out.println("8. Find sum of first N multiples of 4.");
			System.out.println("9. Find the sum of numbers divisible by 2 and 3 up to 50.");
			
			System.out.print("Choose a function: ");
			int choice = input.nextInt();
			System.out.println();
			
			if(choice == 0) {
				System.out.println("Exit Function...");
				break;
			}else if(choice == 1) {
				DivisibleByFive(number);
			}else if(choice == 2) {
				SkippingDivisibleOfThree(number);
			}else if(choice == 3) {
				PrintEveryThirdNumber(number);
			}else if(choice == 4) {
				DivisibleBy7In50And100(number);
			}else if(choice == 5) {
				DivisibleBy2();
			}else if(choice == 6) {
				SumOfDivisibleBy5(number);
			}else if(choice == 7) {
				SumOfAllDivisibleBy3(number);
			}else if(choice == 8) {
				SumOfNaturalDivisibleBy4(number);
			}else if(choice == 9) {
				SumOfDivisibleBy2and3();
			}
		}
	}
}
