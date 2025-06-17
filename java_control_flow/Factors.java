package Java_Control_Flows;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
        } else {
            int counter = 1;
            System.out.println("Factors of " + number + " are:");
            while (counter <= number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        }

        scanner.close();
    }
}
