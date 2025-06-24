package Java_String_Handling;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        System.out.println("Longest word: " + findLongestWord(sentence));
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";
        for (String word : words)
            if (word.length() > longest.length())
                longest = word;
        return longest;
    }
}
