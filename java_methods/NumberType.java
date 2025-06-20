package Java_Methods;

import java.util.Scanner;

public class NumberType {

    public static int checkNumberType(int number) {
        if (number < 0) return -1;
        else if (number > 0) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result = checkNumberType(number);

        if (result == -1) {
            System.out.println("Number is Negative");
        } else if (result == 1) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Zero");
        }
    }
}

