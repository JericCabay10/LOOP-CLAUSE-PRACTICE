package loop;

import java.util.*;

public class Print {
	static Scanner input = new Scanner(System.in);
	static int num;
	
	
	public static void PrintNumberOneToTen(int num) {
		num = 10;
		
		for(int a = 1; a <= num; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
	
	public static int PrintNumbersOneToN(int n) {
		while(true) {
			System.out.print("\nEnter a number: ");
			n = input.nextInt();
			
			for(int a = 0; a <= n; a++) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("\n==== PRINT SIMPLE ====");
			System.out.println("0. Exit System or Function");
			System.out.println("1. Print numbers from 1 to 10.");
			System.out.println("2. Print numbers from 1 to N (user input).");
			System.out.println("3. ");
		
			System.out.print("Choose a function: ");
			int choice = input.nextInt();
			System.out.println();
			
			if(choice == 0) {
				System.out.println("Exit Function...");
				break;
			}else if(choice == 1) {
				PrintNumberOneToTen(num);
			}else if(choice == 2) {
				PrintNumbersOneToN(num);
			}
		}
	}

}
