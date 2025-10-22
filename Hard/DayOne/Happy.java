package Hard.DayOne;

import java.util.*;

public class Happy {
    static Scanner input = new Scanner(System.in);
    public static void CheckHappyNumebrs() {
        while(true) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            if(num == 0) {
                System.out.println("Exit System...");
                break;
            }

            int result = num;

            while(result != 1 && result != 4) {
                int sum = 0;
                int temp = result;

                while(temp != 0) {
                    int digit = temp % 10;
                    sum += digit * digit;
                    temp /= 10;
                }
                result = sum;
            }

            if(result == 1) {
                System.out.println("Happy Number.");
            }else {
                System.out.println("Is not a happy number.");
            }

        }   
    }

    public static void PrintAllHappyNumbers() {
        int num = 500;
		
		for(int a = 1; a <= num; a++) {
			int result = a;
			
			while(result != 1 && result != 4) {
				int temp = result;
				int sum = 0;
				
				while(temp != 0) {
					int digit = temp % 10;
					sum += digit * digit;
					temp /= 10;
				}
				result = sum;
			}
			if(result == 1) {
				System.out.println(a + " ");
			}
		}
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("==== HAPPY NUMBER ====");
            System.out.println("0. Exit System or Function.");
            System.out.println("1. Check if a number is a Happy number.");
            System.out.println("2. Print all Happy numbers between 1 and 500.");

            System.out.print("Choice a function: ");
            int choice = input.nextInt();

            if(choice == 0) {
                System.out.println("Exit System...");
                break;
            }else if(choice == 1) {
                CheckHappyNumebrs();
            }else if(choice == 2) {
                PrintAllHappyNumbers();
            }

        }
    }
    
}