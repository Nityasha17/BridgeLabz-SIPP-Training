package Java_Strings;

import java.util.Scanner;

public class StringLengthWithoutLength {

    public static int getStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // do nothing, loop ends when index is out of bounds
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();

        int manualLength = getStringLength(text);
        int builtInLength = text.length();

        System.out.println("Manual length: " + manualLength);
        System.out.println("Built-in length: " + builtInLength);

        scanner.close();
    }
}
