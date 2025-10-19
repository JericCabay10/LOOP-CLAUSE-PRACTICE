import java.util.Scanner;

public class Print {
    static Scanner scan = new Scanner(System.in);
    public static void Fibonacci() {
        while(true) {
            System.out.print("\nEnter the N term: ");
            int n = scan.nextInt();

            int first = 0;
            int last = 1;

            for(int a = 0; a <= n; a++) {
                System.out.print(first + " ");
                int temp = first + last;
                first = last;
                last = temp;
            }
        }
    }
}
