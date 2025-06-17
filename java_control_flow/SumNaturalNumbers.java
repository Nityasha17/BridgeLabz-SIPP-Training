package Java_Control_Flows;

import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Enter a positive natural number.");
        } else {
            int sumByLoop = 0;
            int counter = 1;

            while (counter <= number) {
                sumByLoop += counter;
                counter++;
            }

            int sumByFormula = number * (number + 1) / 2;

            System.out.println("Sum using while loop: " + sumByLoop);
            System.out.println("Sum using formula: " + sumByFormula);
            System.out.println("Both computations are equal? " + (sumByLoop == sumByFormula));
        }

        scanner.close();
    }
}

