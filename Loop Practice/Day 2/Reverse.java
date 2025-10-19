import java.util.*;

public class Reverse {
    static Scanner scan = new Scanner(System.in);
    public static void word() {
        while(true) {
            System.out.print("Enter a string: ");
            String word = scan.nextLine();
            String original = word;

            if(word.equalsIgnoreCase("0")) {
                System.out.println("Exit function...");
                break;
            }

            String reverse = "";
            for(int a = word.length() - 1; a >= 0; a--) {
                reverse = reverse + word.charAt(a);
            }

            System.out.println("Original word: " + original);
            System.out.println("Reverse word: " + reverse);
        }
    }
}
