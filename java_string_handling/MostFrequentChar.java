package Java_String_Handling;

import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.println("Most Frequent: " + findMostFrequent(str));
    }

    public static char findMostFrequent(String s) {
        int[] count = new int[256];
        for (char ch : s.toCharArray())
            count[ch]++;

        int max = 0;
        char result = ' ';
        for (char ch : s.toCharArray()) {
            if (count[ch] > max) {
                max = count[ch];
                result = ch;
            }
        }
        return result;
    }
}
