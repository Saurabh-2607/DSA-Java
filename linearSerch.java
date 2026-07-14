public class Main {
    public static void main(String[] args) {

        int[] arr = {15, 5, 96, 84, 8, 7, 6, 2, 11};
        int n = 5;
        int end = arr.length - 1;

        for (int i = 0; i <= end; i++) {
            if (arr[i] == n) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}