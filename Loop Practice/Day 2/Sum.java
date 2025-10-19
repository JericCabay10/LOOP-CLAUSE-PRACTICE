import java.util.*;

public class Sum {
    static Scanner scan = new Scanner(System.in);
    public static void single() {
        while(true) {
            System.out.print("Enter a digit: ");
            int digit = scan.nextInt();

            if(digit == 0) {
                System.out.println("Exit function...");
                break;
            }

            while(digit >= 10) {
                int sum = 0;
                while(digit != 0) {
                    sum += digit % 10;
                    digit /= 10;
                }
                digit += sum;
            }
            System.out.println("Digital root: " + digit);
        }
    }

    public static void array() {
        int[] arr = {5, 10, 15, 20, 25};
        int sum = 0;

        System.out.println("Sum all elements in an array using a loop.");
        System.out.println("Array = {5, 10, 15, 20, 25}");

        for(int a = 0; a < arr.length; a++) {
            sum += arr[a];
        }
        System.out.println("Sum of element in array: " + sum);
    }
}
