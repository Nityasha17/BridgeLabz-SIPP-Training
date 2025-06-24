package Java_String_Handling;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.println("Modified: " + removeDuplicates(str));
    }

    public static String removeDuplicates(String s) {
        String result = "";
        for (char ch : s.toCharArray()) {
            if (result.indexOf(ch) == -1)
                result += ch;
        }
        return result;
    }
}
