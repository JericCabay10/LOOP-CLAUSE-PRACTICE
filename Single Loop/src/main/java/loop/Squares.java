package loop;

import java.util.*;

public class Squares {
	static Scanner input = new Scanner(System.in);
	static int number;
	
	public static void SquaresFromOneToTen(int num) {
		num = 10;
		int square = 0;
		for(int a = 1; a <= num; a++) {
			square = a * a;
			
			System.out.println(a + " = " + square);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		while(true) {
			System.out.println("\n==== PRINT SIMPLE ====");
			System.out.println("0. Exit System or Function");
			System.out.println("1. Print squares of numbers from 1 to 10.");
			System.out.println("2. ");
		
			System.out.print("Choose a function: ");
			int choice = input.nextInt();
			System.out.println();
			
			if(choice == 0) {
				System.out.println("Exit Function...");
				break;
			}else if(choice == 1) {
				SquaresFromOneToTen(number);
			}
		}
	}
}
