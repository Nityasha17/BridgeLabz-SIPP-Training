package Java_Strings;

import java.util.Scanner;

public class CharArrayCompare {

    // Method to convert string to char array manually
    public static char[] customToCharArray(String text) {
        char[] characters = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }
        return characters;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();

        char[] customChars = customToCharArray(text);
        char[] builtInChars = text.toCharArray();

        System.out.print("Custom char array: ");
        for (char c : customChars) System.out.print(c + " ");
        System.out.print("\nBuilt-in char array: ");
        for (char c : builtInChars) System.out.print(c + " ");

        System.out.println("\nAre both char arrays equal? " + compareCharArrays(customChars, builtInChars));

        scanner.close();
    }
}
