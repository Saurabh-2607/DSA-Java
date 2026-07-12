import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      String Fruit = sc.next();

      switch (Fruit){
        case "Mango":
          System.out.println("king of fruits");
          break;

        case "Orange":
          System.out.println("a round fruit");
          break;

        case "Apple":
          System.out.println("a red fruit");
          break;

        case "banana":
          System.out.println("a yellow and big fruit");
          break;
      }

    }
}