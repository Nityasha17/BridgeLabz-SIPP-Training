package Java_String_Handling;

import java.util.Scanner;

import java.util.Scanner;

public class SubstringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String str = sc.nextLine();
        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        System.out.println("Occurrences: " + countOccurrences(str, sub));
    }

    public static int countOccurrences(String str, String sub) {
        int count = 0, index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index++;
        }
        return count;
    }
}
