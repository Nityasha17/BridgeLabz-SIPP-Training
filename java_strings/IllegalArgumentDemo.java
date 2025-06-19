package Java_Strings;

import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generateException(String text, int start, int end) {
        System.out.println("Substring: " + text.substring(start, end)); // start > end throws exception
    }

    public static void handleException(String text, int start, int end) {
        try {
            System.out.println("Handled substring: " + text.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: Start index cannot be greater than end index.");
        } catch (Exception e) {
            System.out.println("Caught general exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        // generateException(text, start, end); // may crash
        handleException(text, start, end);

        scanner.close();
    }
}
