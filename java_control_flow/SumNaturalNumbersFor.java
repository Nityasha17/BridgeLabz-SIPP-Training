package Java_Control_Flows;

import java.util.Scanner;

public class SumNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Enter a positive natural number.");
        } else {
            int sumByLoop = 0;

            for (int i = 1; i <= number; i++) {
                sumByLoop += i;
            }

            int sumByFormula = number * (number + 1) / 2;

            System.out.println("Sum using for loop: " + sumByLoop);
            System.out.println("Sum using formula: " + sumByFormula);
            System.out.println("Both computations are equal? " + (sumByLoop == sumByFormula));
        }

        scanner.close();
    }
}
