package Hard.DayOne;


import java.util.*;

public class GCD {
    static Scanner input = new Scanner(System.in);
    public static void FindGCD() {
        while(true) {
			System.out.print("Enter first number: ");
			int num1 = input.nextInt();
			
			System.out.print("Enter second number: ");
			int num2 = input.nextInt();
			
			int min = (num1 < num2) ? num1 : num2;
			int gcd = 1;
			
			for(int a = 1; a < min; a++) {
				if(num1 % a == 0 && num2 % a == 0) {
					gcd = a;
				}
			}
			
			System.out.println("the gcd of " + num1 + " and " + num2 + " = " + gcd);
		}
    }

    public static void main(String[] args) {
        
    }
}