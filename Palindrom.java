import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number or String to check: ");
        String n = sc.next();

        int s = 0;
        int e = n.length() - 1;

        while (e > s) {
            if (n.charAt(e) == n.charAt(s)) {
                e--;
                s++;
            } else {
                System.out.println("This number/String is not a palindrome.");
                return;
            }
        }

        System.out.println("This number/String is a palindrome.");
    }
}