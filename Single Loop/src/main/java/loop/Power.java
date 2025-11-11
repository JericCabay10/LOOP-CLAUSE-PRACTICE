package loop;

import java.util.*;

public class Power {
	static Scanner input = new Scanner(System.in);
	
	public static void FindThePower() {
		while(true) {
			System.out.print("Enter Base: ");
			int base = input.nextInt();
			
			System.out.print("Enter exponent: ");
			int exponent = input.nextInt();
			
			int power = 1;
			
			
			if(base == 0) {
				System.out.println("Exit...");
				break;
			}
			
			for(int a = 1; a <= exponent; a++) {
				power *= base;
			}
			System.out.println(base + "^" + exponent + " = " + power);
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("==== POWER FUNCTIONS ====");
			System.out.println("0. Exit <---");
			System.out.println("1. Find power of a number (base^exponent).");
			
			System.out.print("Choose a function: ");
			int choice = input.nextInt();
			
			if(choice == 0) {
				System.out.println("Exit...");
				break;
			}else if(choice == 1) {
				FindThePower();
			}
			
			
		}
	}

}
