import java.util.*;

public class Divisible {
    static Scanner scan = new Scanner(System.in);
    public static void Seven() {
        int num = 100;

        for(int a = 1; a <= num; a++) {
            if(a % 7 == 0) {
                System.out.print(a + " ");
            }
        }
    }

    public static void skip() {
        while(true) {
            System.out.print("Enter a number: ");
            int num = scan.nextInt();

            if(num == 0 ) {
                System.out.println("Exit function...");
                break;
            }

            for(int a = 1; a <= num; a++) {
                if(a % 3 == 0) {
                    continue;
                }
                System.out.print(a + " ");
            }
        System.out.println();
        }
    }
}
