package Java_Strings;

import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate NumberFormatException
    public static void generateNumberFormatException(String inputText) {
        int number = Integer.parseInt(inputText);  // Will fail if input is not a number
        System.out.println("Converted number is: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleNumberFormatException(String inputText) {
        try {
            int number = Integer.parseInt(inputText);
            System.out.println("Handled number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Input is not a valid number.");
        } catch (Exception e) {
            System.out.println("Caught a general exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to convert to integer: ");
        String userInput = scanner.nextLine();

        // First: Exception generation (uncomment to see abrupt stop)
        // generateNumberFormatException(userInput);

        // Then: Exception handling
        handleNumberFormatException(userInput);

        scanner.close();
    }
}
