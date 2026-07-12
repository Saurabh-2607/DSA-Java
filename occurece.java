import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();   // e.g. 12345121
        int n = sc.nextInt();     // e.g. 1

        int count = 0;
        char digit = (char)(n + '0');

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == digit) {
                count++;
            }
        }

        System.out.println("Number " + n + " occurs " + count + " times in " + num);
    }
}