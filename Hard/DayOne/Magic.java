package Hard.DayOne;

import java.util.*;

public class Magic {
    static Scanner input = new Scanner(System.in);
    public static void CheckMagicNumber() {
        while(true) {
			System.out.print("Enter a number: ");
			int num = input.nextInt();

            if(num == 0) {
                System.out.println("Exit Function....");
                break;
            }
		
			int temp = num;
			
			while(temp > 9) {
				int sum = 0;
				int n = temp;
				while(n != 0) {
					int digit = n % 10;
					sum += digit;
					n /= 10;
				}
				temp = sum;
			}
			if(temp == 1) {
				System.out.println("Happy Number");
			}else {
				System.out.println("Not a happy number");
			}
		}
    }

    public static void PrintAllMagicNumbers() {
        int num = 1000;
		
		for(int a = 1; a <= num; a++) {
			int temp = a;
			
			while(temp > 9) {
				int n = temp;
				int sum = 0;
				
				while(n != 0) {
					int digit = n % 10;
					sum += digit;
					n /= 10;
				}
				temp = sum;
			}
			if(temp == 1) {
				System.out.println(a);
			}
		}
    }

    public static void main(String[] args) {
        while(true) {
             System.out.println("==== MAGIC NUMBER ====");
            System.out.println("0. Exit System or Function.");
            System.out.println("1. Check if a number is a Magic number.");
            System.out.println("2. Print all Magic numbers between 1 and 1000.");


            System.out.print("Choice a function: ");
            int choice = input.nextInt();

            if(choice == 0) {
                System.out.println("Exit System....");
                break;
            }else if (choice == 1) {
                CheckMagicNumber();
            }else if(choice == 2) {
                PrintAllMagicNumbers();
            }
        }
    }
}
