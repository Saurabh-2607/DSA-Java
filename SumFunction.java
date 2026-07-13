import java.util.Scanner;

public class Main {

  public static void Sum(){
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();

    int sum = n1+n2;

    System.out.println("Sum is" + sum);
  }
    public static void main(String[] args) {
      Sum();
      
    }
}