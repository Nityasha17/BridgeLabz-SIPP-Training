package Java_Control_Flows;

import java.util.Scanner;

public class MultipleBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number less than 100: ");
        int number = scanner.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input. Enter a number between 1 and 99.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}
