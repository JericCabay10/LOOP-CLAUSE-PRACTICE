public class Pattern {
    public static void line() {
        int n = 5; // number of stars

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
    public static void triangle() {
        int length = 5;

        for(int a = 1; a <= length; a++) {
            for(int b = 1; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void reverse() {
        int length = 5;

        for(int a = 1; a <= length; a++) {
            for(int b = a; b <= length; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pyramid() {
        int length = 5;

        for(int a = 1; a <= length; a++) {
            for(int b = a; b < length; b++) {
                System.out.print("  ");
            }

            for(int c = 1; c <= a; c++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}
