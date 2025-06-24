package Java_String_Handling;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.println("Toggled: " + toggleCase(str));
    }

    public static String toggleCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch))
                sb.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch))
                sb.append(Character.toUpperCase(ch));
            else
                sb.append(ch);
        }
        return sb.toString();
    }
}
