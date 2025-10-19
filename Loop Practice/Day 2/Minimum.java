public class Minimum {
    public static void array() {
        int[] arr = {9, 6, 7, 1, 6};
        int min = arr[0];

        System.out.println("Array = {9, 6, 7, 1, 6}");

        for(int a = 0; a < arr.length; a++) {
            if(arr[a] < min) {
                min = arr[a];
            }
        }
        System.out.println("Minimum element in array: " + min);
    }
}
