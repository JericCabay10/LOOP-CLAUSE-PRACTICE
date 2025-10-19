import java.util.*;

public class Factors {
    static Scanner scan = new Scanner(System.in);
    public static void number() {
        while(true) {
            System.out.print("Enter a number: ");
            int num = scan.nextInt();

            if (num == 0) {
                System.out.println("Exit function...");
                break;
            }

            for (int a = 1; a <= num; a++) {
                if (num % a == 0) {
                    int pair = num / a;
                    System.out.println(a + " x " + pair + " = " + (a * pair));
                }
            }
        }
    }
}
