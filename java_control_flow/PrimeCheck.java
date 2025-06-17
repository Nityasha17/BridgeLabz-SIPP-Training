package Java_Control_Flows;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean isPrime = true;

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is Not a Prime Number.");
        }

        scanner.close();
    }
}
