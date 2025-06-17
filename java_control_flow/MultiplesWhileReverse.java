package Java_Control_Flows;

import java.util.Scanner;

public class MultiplesWhileReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number less than 100: ");
        int number = scanner.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input. Enter a number between 1 and 99.");
        } else {
            int counter = 99;
            System.out.println("Multiples of " + number + " below 100:");
            while (counter > 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }

        scanner.close();
    }
}
