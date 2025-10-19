import java.util.*;

public class Cubes {
    static Scanner scan = new Scanner(System.in);
    public static void numbers() {
        int num = 10;

        int cube = 0;

            for(int a = 1; a <= num; a++) {
                cube = a * a * a;
                System.out.println("The cube of " + a + " is: " + cube);
            }
    }
}
