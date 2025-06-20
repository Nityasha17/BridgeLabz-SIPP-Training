package Java_Methods;

import java.util.Scanner;

public class QuotientRemainderCalculator {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor;  // quotient
        result[1] = number % divisor;  // remainder
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
            return;
        }

        int[] output = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: " + output[0]);
        System.out.println("Remainder: " + output[1]);
    }
}

