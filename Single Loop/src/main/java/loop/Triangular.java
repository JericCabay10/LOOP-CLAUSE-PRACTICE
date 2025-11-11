package loop;

import java.util.*;

public class Triangular {
	static Scanner input = new Scanner(System.in);
	
	public static void TriangularOfNterm() {
		while(true) {
			System.out.print("Enter a number: ");
			int num = input.nextInt();
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
	
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("==== TRIANGULAR FUNCTIONS ====");
			System.out.println("0. Exit <---");
			System.out.println("1. Calculate Nth triangular number.");
			
			System.out.print("Choose a function: ");
			int choice = input.nextInt();
			
			if(choice == 0) {
				System.out.println("Exit...");
				break;
			}else if(choice == 1) {
				TriangularOfNterm();
			}
		}
	}
}
