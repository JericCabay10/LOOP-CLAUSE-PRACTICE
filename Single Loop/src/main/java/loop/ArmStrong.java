package loop;

import java.util.*;

public class ArmStrong {
	static Scanner input = new Scanner(System.in);
	
	public static void Armstrong() {
		while(true) {
			System.out.print("enter a number: ");
			int num = input.nextInt();
			int original = num;
			int arm = 0;
			
			if(num == 0) {
				System.out.println("Exit...");
				break;
			}
			
			while(num != 0) {
				int temp = num % 10;
				arm += temp * temp * temp;
				num /= 10;
			}
			
			if(arm == original) {
				System.out.println(arm + " Is Armstrong");
			}else {
				System.out.println(arm + " Is not Armstrong");
			}
			
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("==== ARMSTRONG FUNCTIONS ====");
			System.out.println("0. Exit <---");
			System.out.println("1. Check if a number is an Armstrong number.");
			
			System.out.print("Choose a function: ");
			int choice = input.nextInt();
			
			if(choice == 0) {
				System.out.println("Exit...");
				break;
			}else if(choice == 1) {
				Armstrong();
			}
		}
	}

}
