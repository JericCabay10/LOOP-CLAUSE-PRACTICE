package loop;

import java.util.*;

public class Convert {
	static Scanner input = new Scanner(System.in);
	
	
	public static void ConvertBinaryToDecimal() {
		while(true) {
			System.out.print("Enter a binary: ");
			String binary = input.nextLine();
			
			int decimal = 0;
			int power = 1;
			
			if(binary.equals("0") ) {
				System.out.println("Exit...");
				break;
			}
			
			for(int a = binary.length() - 1; a >= 0; a--) {
				int bit = binary.charAt(a) - '0';
				
				decimal += bit * power;
				power *= 2;
			}
			System.out.println("The decimal of " + binary + " is: " + decimal);
		}
	}
	
	public static void ConvertDecimalToBinary() {
		while(true) {
			System.out.print("Enter a decimal: ");
			int decimal = input.nextInt();
			
			String binary = "";
			
			if(decimal == 0) {
				System.out.println("Exit...");
				break;
			}
			
			
			while(decimal > 0) {
				int remainder = decimal % 2;
				binary = remainder + binary;
				decimal /= 2;
			}
			System.out.println("The binary of " + decimal + " is: " + binary);
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("==== CONVERTER FUNCTIONS ====");
			System.out.println("0. Exit <---");
			System.out.println("1. Convert binary to decimal (manual using loop).");
			System.out.println("2. Convert decimal to binary (manual using loop).");
			
			System.out.print("Choose a function: ");
			int choice = input.nextInt();
			input.nextLine();
			
			if(choice == 0) {
				System.out.println("Exit...");
				break;
			}else if(choice == 1) {
				ConvertBinaryToDecimal();
			}else if(choice == 2) {
				ConvertDecimalToBinary();
			}
		}
	}

}
