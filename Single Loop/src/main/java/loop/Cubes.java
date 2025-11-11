package loop;

import java.util.*;

public class Cubes {
	static Scanner input = new Scanner(System.in);
	static int number;
	
	public static void CubesNumberOneToTen(int num) {
		num = 10;
		int cubes = 0;
		
		for(int a = 1; a <= num; a++) {
			cubes = a * a * a;
			
			System.out.println(a + " = " + cubes);
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("\n==== PRINT SIMPLE ====");
			System.out.println("0. Exit System or Function");
			System.out.println("1. Print cubes of numbers from 1 to 10.");
			System.out.println("2. ");
		
			System.out.print("Choose a function: ");
			int choice = input.nextInt();
			System.out.println();
			
			if(choice == 0) {
				System.out.println("Exit Function...");
				break;
			}else if(choice == 1) {
				CubesNumberOneToTen(number);
			}
		}
	}
}
