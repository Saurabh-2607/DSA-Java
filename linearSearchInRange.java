public class Main {
    public static void main(String[] args) {

        int[] arr = {15, 5, 96, 84, 8, 7, 6, 2, 11};
        int n = 15;
        int rs = 1;
        int re = 4;
        int end = arr.length - 1;
        boolean found = false;

        for (int i = rs; i <= re; i++) {
            if (arr[i] == n) {
                System.out.println("Found at index: " + i);
                found = true;
            }
                   
        }
       if(!found){
            System.out.println("404 not found");
          }
    }
}