package Java_Strings;

import java.util.Scanner;

public class SplitWordsCompare {

    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception ignored) {}
        return count;
    }

    public static String[] manualSplitWords(String text) {
        int length = getLength(text);
        int wordCount = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount + 1];
        int start = 0, index = 0;

        for (int i = 0; i <= length; i++) {
            if (i == length || text.charAt(i) == ' ') {
                StringBuilder word = new StringBuilder();
                for (int j = start; j < i; j++) {
                    word.append(text.charAt(j));
                }
                words[index++] = word.toString();
                start = i + 1;
            }
        }

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] manualWords = manualSplitWords(input);
        String[] builtInWords = input.split(" ");

        System.out.println("Manual split:");
        for (String w : manualWords) System.out.println(w);

        System.out.println("\nBuilt-in split:");
        for (String w : builtInWords) System.out.println(w);

        System.out.println("\nAre both splits equal? " + compareArrays(manualWords, builtInWords));
    }
}