import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = in.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = in.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = in.next().charAt(0);

        if (operator == '+') {
            System.out.println("Result = " + (num1 + num2));
        } 
        else if (operator == '-') {
            System.out.println("Result = " + (num1 - num2));
        } 
        else if (operator == '*') {
            System.out.println("Result = " + (num1 * num2));
        } 
        else if (operator == '/') {
            if (num2 != 0) {
                System.out.println("Result = " + (num1 / num2));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } 
        else {
            System.out.println("Invalid operator.");
        }

        in.close();
    }
}