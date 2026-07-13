import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      boolean ans = isArm(n);
      System.out.println(ans);
      
    }

  static boolean isArm(int n){
    int orignal = n;
    int sum = 0;
    while(n>0){
      int rem = n%10;
      n=n/10;
      sum = sum + rem * rem * rem; 
    }
    return sum == orignal;
  }
}