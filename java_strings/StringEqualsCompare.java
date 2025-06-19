package Java_Strings;

import java.util.Scanner;

public class StringEqualsCompare {

    public static boolean customEquals(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String first = scanner.next();
        System.out.print("Enter second string: ");
        String second = scanner.next();

        boolean manualResult = customEquals(first, second);
        boolean builtInResult = first.equals(second);

        System.out.println("Manual comparison result: " + manualResult);
        System.out.println("Built-in equals() result: " + builtInResult);

        scanner.close();
    }
}
