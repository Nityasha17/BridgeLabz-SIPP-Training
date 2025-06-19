package Java_Strings;

import java.util.Scanner;

public class ShortestLongest_Word {

    public static String[] splitWords(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') count++;
        }

        String[] words = new String[count + 1];
        int index = 0, start = 0;

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                StringBuilder word = new StringBuilder();
                for (int j = start; j < i; j++) word.append(text.charAt(j));
                words[index++] = word.toString();
                start = i + 1;
            }
        }
        return words;
    }

    public static int getLength(String word) {
        int len = 0;
        try {
            while (true) {
                word.charAt(len);
                len++;
            }
        } catch (Exception ignored) {}
        return len;
    }

    public static int[] findShortestLongest(String[] words) {
        int minIndex = 0, maxIndex = 0;
        int minLen = getLength(words[0]), maxLen = getLength(words[0]);

        for (int i = 1; i < words.length; i++) {
            int len = getLength(words[i]);
            if (len < minLen) {
                minLen = len;
                minIndex = i;
            }
            if (len > maxLen) {
                maxLen = len;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = splitWords(input);
        int[] result = findShortestLongest(words);

        System.out.println("Shortest word: " + words[result[0]]);
        System.out.println("Longest word: " + words[result[1]]);
    }
}
