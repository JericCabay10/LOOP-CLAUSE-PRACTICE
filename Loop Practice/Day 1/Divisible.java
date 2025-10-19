public class Divisible {
    public static void oneToOneHundred() {
        int num = 100;

        for(int a = 1; a <= num; a++) {
            if(a % 5 == 0) {
                System.out.print(a + " ");
            }
        }
    }
}
