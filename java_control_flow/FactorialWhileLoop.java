package Java_Control_Flows;

import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Invalid input. Please enter a non-negative number.");
        } else {
            int factorial = 1;
            int counter = 1;

            while (counter <= number) {
                factorial *= counter;
                counter++;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}
