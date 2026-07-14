public class Main {

  public static void main(String[] args) {

    int[][] arr = {
      {1, 2, 3, 4, 5, 6, 7, 8},
      {9, 10, 11, 12, 13, 14, 15, 16},
      {17, 18, 19, 20, 21, 22, 23, 24},
      {25, 26, 27, 28, 29, 30, 31, 32}
    };

    int t = 15;

    find(arr, t);
  }

  public static void find(int[][] arr, int t) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] == t) {
          System.out.println("Found at row " + i + ", column " + j);
          return;
        }
      }
    }

    System.out.println("Not Found");
  }
}