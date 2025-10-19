import java.util.*;

public class Largest {
    static Scanner scan = new Scanner(System.in);
    public static void digit() {
        while(true) {
            System.out.print("Enter a digit: ");
            long digit = scan.nextLong();
            long original = digit;

            int largest = 0;


            while(digit != 0) {
                int num = (int)digit % 10;
                if(num > largest) {
                    largest = num;
                }
                digit /= 10;
            }
            System.out.println("The largest digit in " + original + " is: " + largest);
        }
    }
}
