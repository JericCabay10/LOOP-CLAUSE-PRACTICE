import java.util.*;

public class Max {
    static Scanner scan = new Scanner(System.in);
    public static void array() {
        int[] arr = {5, 7, 3, 2, 9};
        int max = arr[0];

        System.out.println("Array = {5, 7, 3, 2, 9}");

        for(int a = 0; a < arr.length; a++) {
            if(arr[a] > max) {
                max = arr[a];
            }
        }
        System.out.println("The max number in array element: " + max);
    }
}
