package Java_Control_Flows;

import java.util.Scanner;

public class sumUntil_Zero_Or_Negative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        System.out.println("Enter numbers to sum (0 or negative number to stop):");

        while (true) {
            System.out.print("Enter a number: ");
            double input = scanner.nextDouble();

            if (input <= 0) {
                break;
            }

            total += input;
        }

        System.out.println("The total sum is: " + total);
        scanner.close();
    }
}

