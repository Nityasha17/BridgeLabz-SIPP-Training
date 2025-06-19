package Java_Arrays;

import java.util.Scanner;

public class ReverseDigitsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int temp = number, count = 0;

        // Count digits
        while (temp > 0) {
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];
        temp = number;

        // Store digits
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Display reversed digits
        System.out.print("Digits in reverse order: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
    }
}
