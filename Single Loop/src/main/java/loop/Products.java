package loop;

import java.util.*;

public class Products {
	static Scanner input = new Scanner(System.in);
	static int number;
	
	public static void ProductsOfDigitNumbers(int digit) {
		digit = 12345;
		int temp = digit;
		int product = 1;
		
		while(temp != 0) {
			int num = temp % 10;
			product *= num;
			temp /= 10;
		}
		System.out.println("The Product of " + digit + " is: " + product);
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.print("==== PRODUCTS FUNCTIONS ====");
			System.out.println("0. Exit --->");
			System.out.println("1. Find the product of digits of a number.");
			
			System.out.print("Enter a function: ");
			int choice = input.nextInt();
			
			if(choice == 0) {
				System.out.println("Exit...");
				break;
			}else if(choice == 1) {
				System.out.println();
				ProductsOfDigitNumbers(number);
				System.out.println();
			}
			
			
		}
	}

}
