import java.util.*;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        while(true) {
            List.list();

            System.out.print("Enter a function: ");
            int choice = scan.nextInt();

            switch(choice) {
                case 0:
                    System.out.println("Exit System...");
                    System.exit(0);
                    break;
                case 1:
                    Alphabet.upperCase();
                    break;
                case 2:
                    Alphabet.lowerCase();
                    break;
                case 3:
                    Sum.single();
                    break;
                case 4:
                    Count.vowels();
                    break;
                case 5:
                    Count.consonants();
                    break;
                case 6:
                    Reverse.word();
                    break;
                case 7:
                    Factors.number();
                    break;
                case 8:
                    Perfect.number();
                    break;
                case 9:
                    Odd.sum();
                    break;
                case 10:
                    TwoInput.Tww();
                    break;
                case 11:
                    Divisible.Seven();
                    break;
                case 12:
                    TwoInput.power();
                    break;
                case 13:
                    TwoInput.gcd();
                    break;
                case 14:
                    TwoInput.lcm();
                    break;
                case 15:
                    Divisible.skip();
                    break;
                case 16:
                    Count.list();
                    break;
                case 17:
                    Sum.array();
                    break;
                case 18:
                    Max.array();
                    break;
                case 19:
                    Minimum.array();
                    break;
                case 20:
                    Pattern.line();
                    break;
                case 21:
                    Pattern.triangle();
                    break;
                case 22:
                    Pattern.reverse();
                    break;
                case 23:
                    Pattern.Pyramid();
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
                    break;
            }
            System.out.println();
        }
    }
}