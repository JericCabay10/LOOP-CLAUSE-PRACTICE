package Hard.DayOne;

import java.util.*;

public class Duck {
    static Scanner input = new Scanner(System.in);
    public static void DuckNumber() {
		while(true) {
			System.out.println("The Duck Number has 0 in the digit example 123045, 123450");
			System.out.println("But if the 0 is in the first it is not Duck number example 012345");
			
			System.out.print("Enter a digit: ");
			int num = input.nextInt();

            if(num == 0) {
                System.out.println("Exit Function...");
                break;
            }
			
			boolean hasZero = false;
			
			int digit = 0;
			while(num != 0) {
				digit = num % 10;
				if(digit == 0) {
					hasZero = true;
                    break;
				}
				num /= 10;
			}

            if (hasZero) {
                System.out.println(num + " is a Duck number.");
            } else {
                System.out.println(num + " is NOT a Duck number.");
            }
		}
	}
 
    public static void main(String[] args) {
        while(true) {
            System.out.print("Choose a function: ");
            int choice = input.nextInt();

            if(choice == 0) {
                System.out.println("Exit System...");
                break;
            }else if(choice == 1) {
                DuckNumber();
            }
        }
    }
}