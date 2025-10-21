package Hard.DayOne;

public class Duck {
    public static void DuckNumber() {
		while(true) {
			System.out.println("The Duck Number has 0 in the digit example 123045, 123450");
			System.out.println("But if the 0 is in the first it is not Duck number example 012345");
			
			System.out.print("Enter a digit: ");
			int num = input.nextInt();
			
			boolean isDuck = true;
			
			int digit = 0;
			while(num != 0) {
				digit = num % 10;
				if(digit != 0) {
					isDuck = false;
					break;
				}
				num /= 10;
			}
		}
	}
    
}