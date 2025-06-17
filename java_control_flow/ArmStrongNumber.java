package Java_Control_Flows;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, originalNumber, remainder, result = 0;

        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += remainder * remainder * remainder;
            originalNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is Not an Armstrong Number.");
        }

        scanner.close();
    }
}
