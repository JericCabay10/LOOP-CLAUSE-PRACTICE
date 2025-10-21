package Hard.DayOne;

public class Strong {
    public static void StrongNumbers() {		
 		int num = 5000;
 			
 		for(int a = 1; a <= num; a++) {
 			int temp = a;
 			int sum = 0;
 			while(temp != 0) {
 				int digit = temp % 10;
 				int factorial = 1;
 					
 				for(int b = 1; b <= digit; b++) {
 					factorial *= b;
 				}
 				sum += factorial;
 				temp /= 10;
 			}
 				
 			if(a == sum) {
 				System.out.println(a + " ");
 			}
 		}		
 	}
}