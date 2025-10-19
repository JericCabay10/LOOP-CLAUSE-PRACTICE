import java.util.*;

public class Average {
    static Scanner scan = new Scanner(System.in);
    public static void natural() {
        while(true) {
            System.out.print("Enter N number: ");
            int n = scan.nextInt();
            int sum = 0;

            if(n == 0) {
                System.out.println("Exit function...");
                break;
            }

            for(int a = 1; a <= n; a++) {
                sum += a;
            }

            double average = sum / n;

            System.out.println("The sum of N: " + sum);
            System.out.println("The average: " + average);
        }
    }
}
