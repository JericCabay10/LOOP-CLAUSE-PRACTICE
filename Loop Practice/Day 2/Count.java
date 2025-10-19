import java.util.*;

public class Count {
    static Scanner scan = new Scanner(System.in);
    public static void vowels() {
        while(true) {
            System.out.print("Enter a string: ");
            String word = scan.nextLine();
            int count = 0;

            if(word.equalsIgnoreCase("0")) {
                System.out.println("Exit function...");
                break;
            }

            System.out.println("word: " + word);
            for(int a = 0; a < word.length(); a++) {
                char ch = word.charAt(a);

                if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ||
                        (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                    count++;
                }
            }
            System.out.println("Count vowels in a string: " + count);
        }
    }

    public static void consonants() {
        while(true) {
            System.out.print("Enter a string: ");
            String word = scan.nextLine();
            int count = 0;

            if(word.equalsIgnoreCase("0")) {
                System.out.println("Exit function...");
                break;
            }

            for(int a = 0; a < word.length(); a++) {
                char ch = word.charAt(a);

                if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    if ((ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') &&
                            (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U')) {
                        count++;
                    }
                }
            }
            System.out.println("Count consonants in a string: " + count);
        }
    }

    public static void list() {
        int positive = 0;
        int negative = 0;

        System.out.print("Enter a number: (0 to n): ");

        while(true) {
            int num = scan.nextInt();

            if(num == 0) {
                break;
            }

            if(num > 0) {
                positive++;
            }else {
                negative++;
            }
        }

        System.out.println("Positive count: " + positive);
        System.out.println("Negative count: " + negative);
    }
}
