import java.util.*;

public class Smaller {
    static Scanner scan = new Scanner(System.in);
    public static void digit() {
        while(true) {
            System.out.print("Enter a digit: ");
            int digit = scan.nextInt();
            int original = digit;

            if(digit == 0) {
                System.out.println("Exit function...");
                break;
            }

            int smallest = 9;
            while(digit != 0) {
                int num = digit % 10;
                if(num < smallest) {
                    smallest = num;
                }
                digit /= 10;
            }
            System.out.println("The smaller number in " + original + " is: " + smallest);
        }
    }
}
