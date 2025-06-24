package Java_Built_In_Functions;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        int a = getInput("Enter first number: ");
        int b = getInput("Enter second number: ");
        int c = getInput("Enter third number: ");

        int max = findMax(a, b, c);
        System.out.println("Maximum number is: " + max);
    }

    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
