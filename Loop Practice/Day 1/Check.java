import java.util.*;

public class Check {
    static Scanner scan = new Scanner(System.in);
    public static void palindrome() {
        while(true) {
            System.out.print("Enter a digit: ");
            int digit = scan.nextInt();
            int original = digit;

            if(digit == 0){
                System.out.println("Exit function...");
                break;
            }

            int reverse = 0;
            while(digit != 0) {
                reverse = reverse * 10 + digit % 10;
                digit /= 10;
            }

            if(reverse == original) {
                System.out.println(reverse + " Is a Palindrome.");
            }else {
                System.out.println(reverse + " Is not palindrome.");
            }
        }
    }
}
