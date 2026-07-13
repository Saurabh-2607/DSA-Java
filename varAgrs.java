import java.util.Arrays;

public class Main {
  static void fun(int ...v){
    System.out.println(Arrays.toString(v));
  }
    public static void main(String[] args) {
      fun(23651, 125, 56, 89);

    }
}