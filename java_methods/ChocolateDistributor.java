package Java_Methods;

import java.util.Scanner;

public class ChocolateDistributor {

    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int[] result = new int[2];
        result[0] = chocolates / children;   // chocolates per child
        result[1] = chocolates % children;   // remaining chocolates
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = scanner.nextInt();

        System.out.print("Enter number of children: ");
        int children = scanner.nextInt();

        if (children == 0) {
            System.out.println("Number of children cannot be zero.");
            return;
        }

        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);
    }
}
