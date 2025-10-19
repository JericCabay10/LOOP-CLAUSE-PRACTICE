public class OddNumbers {
    public static void odd() {
        int num = 20;

        for(int a = 1; a <= num; a++) {
            if(a % 2 == 1) {
                System.out.print(a + " ");
            }
        }
    }
}

