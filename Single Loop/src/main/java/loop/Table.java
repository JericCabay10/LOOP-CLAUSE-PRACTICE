package loop;

import java.util.*;

public class Table {
	static Scanner input = new Scanner(System.in);
	
	public static void Multiplicationtable() {
		while(true) {
			System.out.print("enter a number: ");
			int num = input.nextInt();
			
			if(num == 0) {
				System.out.println("Exit...");
				break;
			}
			
			System.out.print("enter a number: ");
			int num1 = input.nextInt();
			
			
			for(int a = 1; a <= num; a++) {
				System.out.println(num1 + " x " + a + " = " + (num1 * a));
			}
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("==== TABLE FUNCTIONS ====");
			System.out.println("0. Exit <---");
			System.out.println("1. Display multiplication table of N.");
			
			System.out.print("Choose a function: ");
			int choice = input.nextInt();
			
			if(choice == 0) {
				System.out.println("Exit...");
				break;
			}else if(choice == 1) {
				Multiplicationtable();
			}
		}
	}
}
