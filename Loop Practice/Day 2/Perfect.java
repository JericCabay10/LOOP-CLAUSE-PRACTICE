import java.util.*;

public class Perfect {
    static Scanner scan = new Scanner(System.in);
    public static void number() {
        while(true) {
            System.out.print("Enter a number: ");
            int num = scan.nextInt();
            int sum = 0;

            if(num == 0) {
                System.out.println("Exit function...");
                break;
            }

            for(int a = 1; a < num; a++) {
                if(num % a == 0) {
                    sum += a;
                }
            }
            if(sum == num) {
                System.out.println(sum + " is a perfect number");
            }else {
                System.out.println(sum + " is not a perfect number");
            }
        }
    }
}
