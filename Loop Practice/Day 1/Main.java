import java.util.*;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
    int choice = 0;

    do{
        ListOne.list();

        System.out.print("Choose a function: ");
        choice = scan.nextInt();

        if(choice == 0) {
            System.out.println("Exit System...");
            break;
        }else if(choice == 1) {
            NumbersFrom1ToN.numbers();
        }else if(choice == 2) {
            Reverse.number();
        }else if(choice == 3) {
            EvenNumbers.even();
        }else if(choice == 4) {
            OddNumbers.odd();
        }else if(choice == 5) {
            Sum.oneToOneHundred();
        }else if(choice == 6) {
            Sum.even();
        }else if(choice == 7) {
            Sum.odd();
        }else if(choice == 8) {
            MultiplicationTable.table();
        }else if(choice == 9) {
            Count.digit();
        }else if(choice == 10) {
            Find.factorial();
        }else if(choice == 11) {
            Reverse.digit();
        }else if(choice == 12) {
            Check.palindrome();
        }else if(choice == 13) {
            Sum.digits();
        }else if(choice == 14) {
            Product.digit();
        }else if(choice == 15) {
            NumbersFrom1ToN.natural();
        }else if(choice == 16) {
            Divisible.oneToOneHundred();
        }else if(choice == 17) {
            Square.number();
        }else if(choice == 18) {
            Cubes.numbers();
        }else if(choice == 19 ) {
            Count.divisible();
        } else if (choice == 20) {
            Average.natural();
        }else if(choice == 21) {
            Largest.digit();
        }else if(choice == 22) {
            Smaller.digit();
        }else if(choice == 23) {
            Print.Fibonacci();
        }else {
            System.out.println("Invalid Choice. Please try again");
        }

    }while(choice != 0);

    }
}
