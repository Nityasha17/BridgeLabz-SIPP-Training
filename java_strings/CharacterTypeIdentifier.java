package Java_Strings;

import java.util.Scanner;

public class CharacterTypeIdentifier {

    // Method 1: Determine character type
    public static String getCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Convert to lowercase
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method 2: Return 2D array of character and type
    public static String[][] classifyCharacters(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = getCharacterType(text.charAt(i));
        }
        return result;
    }

    // Method 3: Display 2D array in tabular format
    public static void displayCharacterClassification(String[][] table) {
        System.out.printf("%-10s%-15s\n", "Character", "Type");
        System.out.println("-------------------------");
        for (String[] row : table) {
            System.out.printf("%-10s%-15s\n", row[0], row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] result = classifyCharacters(input);
        displayCharacterClassification(result);

        scanner.close();
    }
}

