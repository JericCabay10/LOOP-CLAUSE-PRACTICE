import java.util.*;

public class Find {
    static Scanner scan = new Scanner(System.in);
    public static void factorial() {
        int num = 0;

        do {
            System.out.print("Enter a number: ");
            num = scan.nextInt();
            int factorial = 1;

            if(num == 1) {
                System.out.println(num + " Is Not Factorial");
                continue;
            }

            for(int a = 1; a <= num; a++) {
                factorial *= a;
            }

            System.out.println("The Factorial of number: " + num + " is: " + factorial);


        }while(num != 0);
    }
}
