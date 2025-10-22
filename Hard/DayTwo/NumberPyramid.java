package Hard.DayTwo;

public class NumberPyramid {
    public static void main(String[] args) {
        int rows = 5;
        for (int a = 1; a <= rows; a++) {
            for (int j = a; j < rows; j++) {
                System.out.print("  ");
            }

            for(int c = 1; c <= a; c++) {
                System.out.print(c + "   ");
            } 
            System.out.println();
        }   
    }
}