import java.util.*;

public class Odd {
    public static void sum() {
        int num = 10;
        int sum = 0;

        for(int a = 1; a <= num; a++) {
            if(a % 2 != 0) {
                System.out.print(a );
                if(a < num - 1) {
                    System.out.print(" + ");
                }
                sum += a;
            }
        }
        System.out.println(" = " + sum);
    }
}
