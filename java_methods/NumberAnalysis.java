package Java_Methods;

import java.util.Scanner;

public class NumberAnalysis {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        return Integer.compare(num1, num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            if (!isPositive(numbers[i])) {
                System.out.println("Negative number.");
            } else {
                if (isEven(numbers[i])) {
                    System.out.println("Positive Even number.");
                } else {
                    System.out.println("Positive Odd number.");
                }
            }
        }

        int comparison = compare(numbers[0], numbers[4]);

        if (comparison == 0) {
            System.out.println("First and last numbers are Equal.");
        } else if (comparison > 0) {
            System.out.println("First number is Greater than the last.");
        } else {
            System.out.println("First number is Less than the last.");
        }
    }
}
