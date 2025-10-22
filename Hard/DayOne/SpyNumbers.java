package Hard.DayOne;

import java.util.*;

public class SpyNumbers {
    static Scanner input = new Scanner(System.in);
    public static void FindTheSpyNumber() {
        while(true) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            if(num == 0) {
                System.out.println("Exit Function...");
                break;
            }

            int sum = 0;
            int product = 1;

            while(num != 0) {
                int digit = num % 10;
                sum += digit;
                product *= digit;
                num /= 10;
            }

            if(sum == product) {
                System.out.println(sum + " == " + product + " Is a spy number.");
            }else {
                System.out.println(sum + " == " + product + " Is not a spy number");
            }
        } 
    }

    public static void PrintAllSpyNumbers() {
        int num = 1000;

        for(int a = 1; a <= num; a++) {
            int temp = a;
            int sum = 0;
            int product = 1;

            while(temp != 0) {
                int digit = temp % 10;
                sum += digit;
                product *= digit;
                temp /= 10;
            }

            if(sum == product) {
                System.out.print(a + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        while(true) {
            System.out.println("\n0. Exit System or Function.");
            System.out.println("1. Check if a number is a Spy number.");
            System.out.println("2. Print all Spy numbers from 1 to 1000.");

            System.out.print("Choose a function: ");
            int choice = input.nextInt();

            if(choice == 0) {
                System.out.println("Exit System...");
                break;
            }else if(choice == 1) {
                FindTheSpyNumber();
            }else if(choice == 2) {
                PrintAllSpyNumbers();
            }else {
                System.out.println("Invalid choice. Please try again!");
            }
        }
    }
}
