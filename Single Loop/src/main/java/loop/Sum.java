package loop;

import java.util.*;

public class Sum {
	static Scanner input = new Scanner(System.in);
	static int number, number1;
	
	public static void SumOf1To10(int sum) {
		for(int a = 1; a <= 10; a++) {
			sum += a;
		}
		System.out.println("The sum of 1 to 10 is: " + sum);
	}
	
	public static void SumOfSquareNumbers(int num) {
		while(true) {
			System.out.print("\nEnter n term: ");
			num = input.nextInt();
			
			int square = 1;
			int sum = 0;
			
			if(num == 0) {
				System.out.println("Exit...");
				break;
			}
			
			for(int a = 1; a <= num; a++) {
				square = a * a;
				sum += square;
				System.out.println(a + " = " + square);
			}
			System.out.println("sum = " + sum);
		}
	}
	
	public static void SumOfCubeNumbers(int num) {
		while(true) {
			System.out.print("\nEnter n term: ");
			num = input.nextInt();
			
			int cubes = 1;
			int sum = 0;
			
			if(num == 0) {
				System.out.println("Exit...");
				break;
			}
			
			for(int a = 1; a <= num; a++) {
				cubes = a * a * a;
				sum += cubes;
				System.out.println(a + " = " + cubes);
			}
			System.out.println("sum = " + sum);
		}
	}
	
	public static void SumOfDigitOfNumbers(int digit) {
		digit = 12345;
		int temp = digit;
		int sum = 0;
		
		while(digit != 0) {
			int num = digit % 10;
			sum += num;
			digit /= 10;
		}
		System.out.println("The sum of digits " + temp + " is: " + sum);
	}
	
	public static void SumOfFirstN100NaturalNumbers(int sum) {
		for(int a = 1; a <= 100; a++) {
			sum += a;
		}
		System.out.println("Sum of first 100 natural numbers is: " + sum);
	}
	
	public static void SumAllBetweenTwoGivenNumbers(int num, int num1) {
		while(true) {
			System.out.print("\nFirst number: ");
			num = input.nextInt();
			int sum = 0;
			
			if(num == 0) {
				System.out.println("Exit...");
				break;
			}
			
			System.out.print("Second number: ");
			num1 = input.nextInt();
			
			if(num > num1) {
				System.out.println("The First number is lower than Second number");
			}else {
				for(int a = num; a <= num1; a++) {
					sum += a;
				}
				System.out.println("Sum of the two given number is: " + sum);
			}
			
		}
	}

	public static void CumulativeSum(int num) {
		while(true) {
			System.out.print("\nEnter a number: ");
			num = input.nextInt();
			
			int sum = 0;
			
			if(num == 0) {
				System.out.println("Exit...");
				break;
			}
			
			for(int a = 1; a <= num; a++) {
				sum += a;
				System.out.println(a + " = " + sum);
			}
		}
	}
	
	public static void DiffOfEvenAndOddSum(int num) {
		while(true) {
			System.out.print("\nEnter  number: ");
			num = input.nextInt();
			
			int sumEven = 0;
			int sumOdd = 0;
			
			if(num == 0) {
				System.out.println("Exit...");
				break;
			}
			
			for(int a = 1; a <= num; a++) {
				if(a % 2 == 0) {
					sumEven += a;
				}
			}
			
			for(int a = 1; a <= num; a++) {
				if(a % 2 == 1) {
					sumOdd += a;
				}
			}
			
			int diff = sumOdd - sumEven;
			System.out.println("The difference between sum of even and odd numbers up to N is: " + diff);
		}
	}
	
	public static void SumOf3DigitNumbers(int num) {
		while(true) {
			System.out.print("\nEnter 3 digit: ");
			num = input.nextInt();
			
			int temp = num;
			int sum = 0;
			
			if(num == 0) {
				System.out.println("Exit...");
				break;
			}else if(num <= 99 && num >= 1000) {
				System.out.println("3 digit only");
			}else {
				while(num != 0) {
					int digit = num % 10;
					sum += digit;
					num /= 10;
				}
				
				System.out.println("Sum of digits of a " + temp + " is: " + sum);
			}
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("\n==== PRINT SIMPLE ====");
			System.out.println("0. Exit System or Function");
			System.out.println("1. Find the sum of numbers from 1 to 10.");
			System.out.println("4. Find the sum of squares from 1 to N.");
			System.out.println("5. Find the sum of cubes from 1 to N.");
			System.out.println("7. Find the sum of digits of a number.");
			System.out.println("9. Find sum of first 100 natural numbers.");
			System.out.println("10. Find sum of all numbers between two given numbers.");
			System.out.println("11. Calculate running total (cumulative sum) up to N.");
			System.out.println("13. Find difference between sum of even and odd numbers up to N.");
			System.out.println("14. Find sum of digits of a 3-digit number.");
			
			System.out.print("Choose a function: ");
			int choice = input.nextInt();
			System.out.println();
			
			if(choice == 0) {
				System.out.println("Exit Function...");
				break;
			}else if(choice == 1) {
				SumOf1To10(number);
			}else if(choice == 4) {
				SumOfSquareNumbers(number);
			}else if(choice == 5) {
				SumOfCubeNumbers(number);
			}else if(choice == 7) {
				SumOfDigitOfNumbers(number);
			}else if(choice == 9) {
				SumOfFirstN100NaturalNumbers(number);
			}else if(choice == 10) {
				SumAllBetweenTwoGivenNumbers(number, number1);
			}else if(choice == 11) {
				CumulativeSum(number);
			}else if(choice == 13) {
				DiffOfEvenAndOddSum(number);
			}else if(choice == 14) {
				SumOf3DigitNumbers(number);
			}
		}
	}

}
