import java.util.*;

public class TwoInput {
    static Scanner scan = new Scanner(System.in);
    public static void Tww() {
        while(true) {
            System.out.println("Print numbers between two given numbers.");

            System.out.print("First number: ");
            int first = scan.nextInt();

            System.out.print("Second number: ");
            int second = scan.nextInt();

            System.out.print("Between " + first + " and " + second + ": ");
            for(int a = first - 1; a < second; a++) {
                System.out.print(a + " ");
            }
            System.out.println("\n");
        }
    }

    public static void power() {
        while(true) {
            System.out.println("\nCalculate the power of a number (base^exponent).");

            System.out.print("Base number: ");
            int base = scan.nextInt();

            if(base == 0) {
                System.out.println("Exit function...");
                break;
            }

            System.out.print("Exponent number: ");
            int exponent = scan.nextInt();

            int result = 1;

            for(int a  = 1; a <= exponent; a++) {
                result = base * a;
            }
            System.out.println("The power of " + base + "^" + exponent + " = " + result);
        }
    }

    public static void gcd() {
        while(true) {
            System.out.print("first number: ");
            int first = scan.nextInt();

            if( first == 0) {
                System.out.println("Exit function...");
                break;
            }

            System.out.print("Second number: ");
            int second = scan.nextInt();

            int gcd = 1;

            for(int a = 1; a <= first && a <= second; a++) {
                if(first % a == 0 && second % a == 0) {
                    gcd = a;
                }
            }
            System.out.println("The gcd of " + first + " and " + second + " = " + gcd);
        }
    }

    public static void lcm() {
        while(true) {
            System.out.print("first number: ");
            int first = scan.nextInt();

            if( first == 0) {
                System.out.println("Exit function...");
                break;
            }

            System.out.print("Second number: ");
            int second = scan.nextInt();

            //Lamda
            int max = (first > second) ? first : second;

            int lcm = 1;

            for(int a = max; ; a++) {
                if(a % first == 0 && a % second == 0) {
                    lcm = a;
                    break;
                }
            }

            System.out.println("The lcm of: " + first + " and " + second + " = " + lcm);
        }
    }
}
