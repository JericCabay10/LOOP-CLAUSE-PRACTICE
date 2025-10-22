package Hard.DayOne;

import java.util.*;

public class Factorial {
    static Scanner input = new Scanner(System.in);
    public static void Factorials() {
        int num = 20;

        for(int a = 1; a <= num; a++) {
            long factorial = 1;
            for(int b = 1; b <= a; b++) {
                factorial *= b;
            }
            System.out.println(a + " = " + factorial);
        }
    }

    public static void FactorialSumOfDigit() {
        while(true) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            if(num == 0) {
                System.out.println("Exit Function...");
                break;
            }

            int sum = 0;
            while(num != 0) {
                int digit = num % 10;
                int factorial = 1;
                for(int a = 1; a <= digit; a++) {
                    factorial *= a;
                }
                sum += factorial;
                num /= 10;
            }
            System.out.println("The sum of factorial of digits = " + sum);
        }
    }


    public static void main(String[] args) {
        while(true) {
            System.out.println("==== FACTORIAL CALCULATOR ====");
            System.out.println("0. Exit System or Function.");
            System.out.println("1. Display all factorials from 1! to 20!.");
            System.out.println("2. Display the sum of factorial of digits of a number.");

            System.out.print("Choice a function: ");
            int choice = input.nextInt();

            if(choice == 0) {
                System.out.println("Exiting System...");
                break;
            }else if(choice == 1) {
                Factorials();
            }else if(choice == 2) {
                FactorialSumOfDigit();
            }
        }
    
    }
}
