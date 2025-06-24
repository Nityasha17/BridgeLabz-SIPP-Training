package Java_Built_In_Functions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();

        generateFibonacci(n);
    }

    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }
}
