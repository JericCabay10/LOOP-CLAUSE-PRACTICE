import java.util.Scanner;

public class Sum {
    static Scanner scan = new Scanner(System.in);

    public static void oneToOneHundred() {
        int num = 100;
        int sum = 0;

        for(int a = 1; a <= num; a++) {
            System.out.print(a + " ");
            sum += a;
        }
        System.out.println("\nTotal of 1 to 100: " + sum);
    }

    public static void even() {
        int num = 50;
        int sum = 0;

        for(int a = 1; a <= num; a++) {
            if(a % 2 == 0) {
                sum += a;
            }
        }
        System.out.println("\nThe sum of even numbers from 1 to 50: " + sum);
    }

        public static void odd() {
        int num = 50;
        int sum = 0;

        for(int a = 0; a <= num; a++) {
            if(a % 2 == 1) {
                sum += a;
            }
        }
        System.out.println("The sum of odd numbers: " + sum);
    }

     public static void digits() {
        while(true) {
            System.out.print("Enter a digit: ");
            int digit = scan.nextInt();
            int original = digit;
            if(digit == 0) {
                System.out.println("Exit function...");
                break;
            }

            int sum = 0;
            while(digit != 0) {
                sum += digit % 10;
                digit /= 10;
            }

            System.out.println("Digit: " + original);
            System.out.println("The sum of digit is: " + sum);
        }
    }
}
