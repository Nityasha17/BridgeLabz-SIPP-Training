package Java_Strings;

import java.util.Scanner;

public class SubStringCompare {

    // User-defined substring method using charAt()
    public static String customSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end && i < text.length(); i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    // Compare two strings character-by-character
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        String manualSub = customSubstring(text, start, end);
        String builtInSub = text.substring(start, end);

        System.out.println("Manual substring: " + manualSub);
        System.out.println("Built-in substring: " + builtInSub);
        System.out.println("Are both equal? " + compareStrings(manualSub, builtInSub));

        scanner.close();
    }
}

