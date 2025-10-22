package Hard.DayOne;

import java.util.*;

public class Automorphic {
	static Scanner input = new Scanner(System.in);
    public static void AutomorphicNumbers() {
		while(true) {
			System.out.println("Enter a number: ");
			int num = input.nextInt();
			
			if(num == 0) {
				System.out.println("Exit Function...");
				break;
			}
			
			int original = num;
			int square = num * num;
			boolean isAutomorphic = true;
			
			while(num != 0) {
				int digitNum = num % 10;
				int digitSquare = square % 10;
				
				if(digitNum != digitSquare) {
					isAutomorphic = false;
					break;
				}
				
				num /= 10;
				square /= 10;
			}
			
			if(isAutomorphic) {
	            System.out.println(original + " is an Automorphic number.");
			}else {
	            System.out.println(original + " is Not an Automorphic number.");
			}
		}
	}
    
    public static void FindAllAutomorphic() {
		int num = 1000;
		
		for(int a = 1; a <= num; a++) {
			int temp = a;
			int square = a * a;
			boolean isAutomorphic = true;
			
			while(temp != 0) {
				int digitNum = temp % 10;
				int digitSquare = square % 10;
				
				if(digitNum != digitSquare) {
					isAutomorphic = false;
					break;
				}
				
				temp /= 10;
				square /= 10;
			}
			
			if(isAutomorphic) {
	            System.out.println(a);
			}
		}
		
	}
}