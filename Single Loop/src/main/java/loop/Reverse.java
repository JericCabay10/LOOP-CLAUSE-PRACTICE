package loop;

import java.util.*;

public class Reverse {
	static Scanner input = new Scanner(System.in);
	static int num;

	public static void RerverseNumber(int num) {
		num = 10;
		for(int a = num; a >= 1; a--) {
			System.out.print(a + " ");
		}
	}
	
	public static void ReverseFromNToOne(int num) {
		while(true) {
			System.out.print("\nEnter a number: ");
			num = input.nextInt();
			
			for(int a = num; a >= 1; a--) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}
	
	public static void CheckPalindrome(int digit) {
		while(true) {
			System.out.print("Enter a number: ");
			digit = input.nextInt();
			
			int original = digit;
			int reverse = 0;
			
			if(digit == 0) {
				System.out.println("Exit...");
				break;
			}
			
			while(digit != 0) {
				reverse = reverse * 10 + digit % 10;
				digit /= 10;
			}
			
			if(original == reverse) {
				System.out.println(reverse + " Is Palindrome");
			}else {
				System.out.println(reverse + " Is not Palindrome");
			}
		}
	}
	

	public static void main(String[] args) {
		while(true) {
			System.out.println("\n==== PRINT SIMPLE ====");
			System.out.println("0. Exit System or Function");
			System.out.println("1. Print numbers from 10 to 1 (reverse order).");
			System.out.println("2. Print numbers from N down to 1.");
			System.out.println("3. Check if a number is palindrome (using loop).");
		
			System.out.print("Choose a function: ");
			int choice = input.nextInt();
			System.out.println();
			
			if(choice == 0) {
				System.out.println("Exit Function...");
				break;
			}else if(choice == 1) {
				RerverseNumber(num);
			}else if(choice == 2) {
				ReverseFromNToOne(num);
			}else if(choice == 3) {
				CheckPalindrome(num);
			}
		}
	}
}
