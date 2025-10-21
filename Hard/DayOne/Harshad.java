package Hard.DayOne;

public class Harshad {
    	public static void HarshadNumbers() {
		while(true) {
			System.out.print("Enter a number: ");
			int num = input.nextInt();
			
			if(num == 0) {
				System.out.println("Exit Function...");
				break;
			}
			
			int temp = num;
			
			int sum = 0;
			while(temp != 0) {
				int digit = temp % 10;
				sum += digit;
				temp /= 10;
			}
			
			if(num % sum == 0) {
	            System.out.println(num + " is a Harshad (Niven) number.");
			}else {
	            System.out.println(num + " is NOT a Harshad (Niven) number.");
			}
		}
	}

    	public static void FindAllHarshed() {
		int num = 1000;
		
		for(int a = 1; a <= num; a++) {
			int temp = a;
			int sum = 0;
			while(temp != 0) {
				int digit = temp % 10;
				sum += digit;
				temp /= 10;
			}
			
			if(a % sum == 0) {
				System.out.println(a + " ");
			}
		}
	}
}