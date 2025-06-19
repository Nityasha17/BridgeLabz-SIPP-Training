package Java_Strings;

import java.util.Scanner;

public class TrimSpaces {

    public static int[] getTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1}; // end+1 because substring is exclusive
    }

    public static String getSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end && i < text.length(); i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text with leading/trailing spaces: ");
        String input = scanner.nextLine();

        int[] bounds = getTrimIndexes(input);
        String trimmedManual = getSubstring(input, bounds[0], bounds[1]);
        String trimmedBuiltIn = input.trim();

        System.out.println("Manual Trimmed Text: '" + trimmedManual + "'");
        System.out.println("Built-in Trimmed Text: '" + trimmedBuiltIn + "'");
        System.out.println("Are both equal? " + compareStrings(trimmedManual, trimmedBuiltIn));
    }
}
