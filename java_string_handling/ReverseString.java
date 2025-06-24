package Java_String_Handling;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to reverse: ");
        String str = sc.nextLine();

        String reversed = reverse(str);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--)
            rev += s.charAt(i);
        return rev;
    }
}
