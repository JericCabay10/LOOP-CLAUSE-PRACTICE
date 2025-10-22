package Hard.DayOne;

import java.util.*;

public class LCM {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
			int num1 = input.nextInt();
			
			System.out.print("Enter second number: ");
			int num2 = input.nextInt();

            int lcm = 1;
            int max = (num1 > num2) ? num1 : num2;

            for(int a = max; ; a++) {
                if(a % num1 == 0 && a % num2 == 0) {
                    lcm = a;
                    break;
                }
            }
			System.out.println("the lcm of " + num1 + " and " + num2 + " = " + lcm);
    }
}
