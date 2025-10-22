package Hard.DayOne;

import java.util.*;

public class Product {
    static Scanner input = new Scanner(System.in);
    
    public static void FindTheProductOfDigits() {
        while(true) {
            System.out.println("Enter a number: ");
            int num = input.nextInt();
        
            int product = 1;

            while(num != 0) {
                int digit = num % 10;
                product *= digit;
                num /= 10;
            }

            System.out.println("The product of digit is " + product);
        }
    }

    
    public static void main(String[] args) {
        while(true) {
            System.out.println("==== Product Calculator ====");
            System.out.println("0. Exit System or Function.");
            System.out.println("1. Find the product of digits in a number using loop.");

            System.out.print("Choose an fcuntion: ");
            int choice = input.nextInt();

            if(choice == 0) {
                System.out.println("Exiting System...");
                break;
            }else if(choice == 1) {
                FindTheProductOfDigits();
            }
        }
    }
}
