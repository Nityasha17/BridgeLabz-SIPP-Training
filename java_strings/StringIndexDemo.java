package Java_Strings;

import java.util.Scanner;

public class StringIndexDemo {

    public static void generateException(String text, int index) {
        System.out.println("Character: " + text.charAt(index)); // may crash
    }

    public static void handleException(String text, int index) {
        try {
            System.out.println("Handled character: " + text.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Invalid character index.");
        } catch (Exception e) {
            System.out.println("Caught a general exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter index to access: ");
        int index = scanner.nextInt();

        // generateException(input, index); // may crash
        handleException(input, index);

        scanner.close();
    }
}
