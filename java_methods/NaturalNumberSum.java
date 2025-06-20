package Java_Methods;
import java.util.Scanner;

public class NaturalNumberSum {

    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number > 0) {
            int result = sumOfNaturalNumbers(number);
            System.out.println("Sum of first " + number + " natural numbers is: " + result);
        } else {
            System.out.println("Please enter a positive number.");
        }
    }
}
