import java.util.*;

public class Count {
    static Scanner scan = new Scanner(System.in);
    public static void digit() {
        while(true) {
            System.out.print("Enter a number: ");
            long num = scan.nextLong();
            int count = 0;

            if(num == 0) {
                System.out.println("Exit function...");
                break;
            }

            while(num != 0) {
                count++;
                num /= 10;
            }

            System.out.println("Count: " + count);
        }
    }

    public static void divisible() {
        int num = 50;

        for(int a = 1; a <= num; a++) {
            if(a % 3 == 0) {
                System.out.print(a + " ");
            }
        }
        System.out.println();
    }
}
