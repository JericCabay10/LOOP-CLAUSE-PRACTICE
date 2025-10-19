import java.util.*;

public class Product {
    static Scanner scan = new Scanner(System.in);
    public static void digit() {
        while(true) {
            System.out.print("Enter a digit: ");
            int digit = scan.nextInt();
            int original = digit;
            int product = 1;

            if(digit == 0) {
                System.out.println("Exit function...");
                break;
            }

            while(digit != 1) {
                product *= digit % 10;
                digit /= 10;
            }

            System.out.println("The product of " + original + " is: " + product );
        }
    }
}

