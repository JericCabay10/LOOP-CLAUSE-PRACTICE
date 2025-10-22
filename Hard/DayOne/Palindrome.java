package Hard.DayOne;

import java.util.*;

public class Palindrome {
    static Scanner input = new Scanner(System.in);
    public static void FindStrongPalindrome() {
        while(true) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            int original = num;

            int reverse = 0;
            while(num != 0) {
                reverse = reverse * 10 + num % 10;
                num /= 10;
            }

            int temp = original;
            int strong = 0;
            while(temp != 0) {
                int digit = temp % 10;
                strong += digit * digit * digit;
                temp /= 10;
            }

            if((original == reverse) && (original == strong)) {
                System.out.println(strong + " Strong palindrome");
            }else {
                System.out.println(strong + " Is not a strong palindrome");
            }
        }
    }
    public static void main(String[] args) {
         while(true) {
            System.out.println("==== Product Calculator ====");
            System.out.println("0. Exit System or Function.");
            System.out.println("1. Check if a number is a strong palindrome (Armstrong + Palindrome).");
            System.out.println("2. Find All Strong Palindromes In a range.");

            System.out.print("Choose an fcuntion: ");
            int choice = input.nextInt();

            if(choice == 0) {
                System.out.println("Exiting System...");
                break;
            }else if(choice == 1) {
                FindStrongPalindrome();
            }
        }
    }
}
