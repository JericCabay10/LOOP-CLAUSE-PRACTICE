import java.util.*;

public class MultiplicationTable {
    static Scanner scan = new Scanner(System.in);
    public static void table() {
        System.out.print("Enter number of rows: ");
        int row = scan.nextInt();
        int length = 12;

        for(int a = 1; a <= row; a++) {
            for(int b = 1; b <= length; b++) {
                System.out.print(b + " x " + a + " = " + (a * b) + "\t");
            }
            System.out.println();
        }

    }
}
