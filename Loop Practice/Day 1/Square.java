import java.util.*;

public class Square {
    static Scanner scan = new Scanner(System.in);
    public static void number() {
        int num = 10;
        int square = 0;

        for(int a = 1; a <= num; a++) {
            square = a * a;
            System.out.println("The Square of " + a + " is: " + square);
        }
    }
}
