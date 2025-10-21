package Hard.DayOne;

public class Armstrong {
    public static void ArmStrong() {
	    for(int a = 1; a <= 10000; a++) {
		    int original = a;
		    int armstrong = 0;
		    int temp = a;
			
		    while(temp != 0) {
			    int num = temp % 10;
			    armstrong += num * num * num;
			    temp /= 10;
		    }
			
		    if(armstrong == original) {
			    System.out.println(armstrong + " ");
		    }
	    }
    }
}