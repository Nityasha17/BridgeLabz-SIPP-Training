package Java_Strings;

import java.util.Scanner;

public class VowelConsonantCounter {

    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char) (ch + 32); // convert to lowercase

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return "Vowel";
            else return "Consonant";
        } else {
            return "Not a Letter";
        }
    }

    public static int[] countVowelsAndConsonants(String text) {
        int[] count = new int[2]; // [0] => vowels, [1] => consonants

        for (int i = 0; i < text.length(); i++) {
            String type = checkCharacterType(text.charAt(i));
            if (type.equals("Vowel")) count[0]++;
            else if (type.equals("Consonant")) count[1]++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        int[] result = countVowelsAndConsonants(text);
        System.out.println("Number of Vowels: " + result[0]);
        System.out.println("Number of Consonants: " + result[1]);

        scanner.close();
    }
}
