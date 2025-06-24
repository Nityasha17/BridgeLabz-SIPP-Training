package Java_String_Handling;

import java.util.Scanner;

public class LexicographicalCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter String 2: ");
        String s2 = sc.nextLine();

        int result = compareLex(s1, s2);
        if (result < 0)
            System.out.println(s1 + " comes before " + s2);
        else if (result > 0)
            System.out.println(s2 + " comes before " + s1);
        else
            System.out.println("Both strings are equal.");
    }

    public static int compareLex(String a, String b) {
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            if (a.charAt(i) != b.charAt(i))
                return a.charAt(i) - b.charAt(i);
        }
        return a.length() - b.length();
    }
}
