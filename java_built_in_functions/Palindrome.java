package Java_Built_In_Functions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String input = getInput();
        if (isPalindrome(input))
            System.out.println("It is a palindrome.");
        else
            System.out.println("It is not a palindrome.");
    }

    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return scanner.nextLine().replaceAll("\\s", "").toLowerCase();
    }

    public static boolean isPalindrome(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
