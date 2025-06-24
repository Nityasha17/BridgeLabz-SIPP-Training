package Java_String_Handling;

import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = sc.nextLine().charAt(0);

        System.out.println("Modified: " + removeChar(str, ch));
    }

    public static String removeChar(String s, char ch) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray())
            if (c != ch)
                sb.append(c);
        return sb.toString();
    }
}
