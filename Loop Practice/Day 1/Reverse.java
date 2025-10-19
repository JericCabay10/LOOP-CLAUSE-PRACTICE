import java.util.*;

public class Reverse {
    static Scanner scan = new Scanner(System.in);
    public static void number() {
        int num = 10;

        for(int a = num; a >= 1; a--) {
            System.out.print(a + " ");
        }
    }

    public static void digit() {
        int num = 0;

        while(true) {
            System.out.print("Enter a number: ");
            num = scan.nextInt();

            if(num == 0) {
                System.out.println("Exit function...");
                break;
            }

            int reverse = 0;
            while(num != 0) {
                reverse = reverse * 10 + num % 10;
                num /= 10;
            }

            System.out.println("Reverse number: " + reverse);
        }
    }
}

