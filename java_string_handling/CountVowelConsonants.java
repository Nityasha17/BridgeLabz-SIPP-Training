package Java_String_Handling;

import java.util.Scanner;

public class CountVowelConsonants {
    public static void main(String[] args) {
        String input = getInput();
        countVowelsAndConsonants(input);
    }

    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine().toLowerCase();
    }

    public static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
