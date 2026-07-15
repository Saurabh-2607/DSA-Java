import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Amount(Rs.), Time(Year), and Rate(%)");
        int p = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();

        System.out.println("Interest is " + (p*t*r)/100);
        
    }
}