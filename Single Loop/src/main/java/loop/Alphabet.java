package loop;

import java.util.*;

public class Alphabet {
	static Scanner input = new Scanner(System.in);
	static char chr;
	
	public static void PrintAlphabet(char ch) {
		ch = 'Z';
		
		for(char a = 'A'; a <= ch; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		ch = 'a';
		
		for(char a = 'a'; a <= 'z'; a++) {
			System.out.print(a + " ");
		}
		
		System.out.println();
	}
	
	public static void ASCIICode() {
		for(int a = 'A'; a <= 'Z'; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("\n==== PRINT SIMPLE ====");
			System.out.println("0. Exit System or Function");
			System.out.println("1. Print the alphabet from a to z and A to Z.");
			System.out.println("2. Print characters from ASCII code 65 to 90.");
		
			System.out.print("Choose a function: ");
			int choice = input.nextInt();
			System.out.println();
			
			if(choice == 0) {
				System.out.println("Exit Function...");
				break;
			}else if(choice == 1) {
				PrintAlphabet(chr);
			}else if(choice == 2) {
				ASCIICode();
			}
		}
	}

}
