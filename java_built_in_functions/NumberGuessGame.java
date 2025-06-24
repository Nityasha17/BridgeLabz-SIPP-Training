package Java_Built_In_Functions;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int low = 1, high = 100;
        String feedback;
        int guess;

        System.out.println("Think of a number between 1 and 100. I'll guess it!");

        do {
            guess = generateGuess(low, high);
            System.out.println("Is it " + guess + "? (Enter: high / low / correct): ");
            feedback = scanner.nextLine();

            if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            }
        } while (!feedback.equalsIgnoreCase("correct"));

        System.out.println("Yay! I guessed it right.");
    }

    public static int generateGuess(int low, int high) {
        return low + random.nextInt(high - low + 1);
    }
}
