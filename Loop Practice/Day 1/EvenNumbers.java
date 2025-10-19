public class EvenNumbers {
    public static void even() {
        int num = 20;

        for(int a = 1; a <= num; a++) {
            if(a % 2 == 0) {
                System.out.print(a + " ");
            }
        }
    }
}
