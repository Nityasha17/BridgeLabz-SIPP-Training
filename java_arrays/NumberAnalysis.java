package Java_Arrays;

import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Analysis
        for (int number : numbers) {
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println(number + " is Positive and Even");
                } else {
                    System.out.println(number + " is Positive and Odd");
                }
            } else if (number < 0) {
                System.out.println(number + " is Negative");
            } else {
                System.out.println("Zero");
            }
        }

        // First vs Last
        if (numbers[0] == numbers[4]) {
            System.out.println("First and Last elements are Equal.");
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First element is Greater than Last.");
        } else {
            System.out.println("First element is Less than Last.");
        }
    }
}
