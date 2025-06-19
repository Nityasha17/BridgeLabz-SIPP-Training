package Java_Strings;

import java.util.Scanner;

public class WordLengths {

    public static String[] splitWords(String text) {
        int length = text.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') count++;
        }

        String[] words = new String[count + 1];
        int index = 0, start = 0;
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

    public static int getLength(String word) {
        int count = 0;
        try {
            while (true) {
                word.charAt(count);
                count++;
            }
        } catch (Exception ignored) {}
        return count;
    }

    public static String[][] buildWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getLength(words[i]));
        }
        return table;
    }

    public static void displayWordLengthTable(String[][] table) {
        System.out.printf("%-15s%-10s\n", "Word", "Length");
        System.out.println("---------------------------");
        for (String[] row : table) {
            System.out.printf("%-15s%-10s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = splitWords(input);
        String[][] table = buildWordLengthTable(words);
        displayWordLengthTable(table);
    }
}
