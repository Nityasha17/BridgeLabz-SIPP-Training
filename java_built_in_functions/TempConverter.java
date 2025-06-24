package Java_Built_In_Functions;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1 for C to F, 2 for F to C: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter Celsius: ");
            double c = scanner.nextDouble();
            System.out.println("Fahrenheit: " + celsiusToFahrenheit(c));
        } else {
            System.out.print("Enter Fahrenheit: ");
            double f = scanner.nextDouble();
            System.out.println("Celsius: " + fahrenheitToCelsius(f));
        }
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
