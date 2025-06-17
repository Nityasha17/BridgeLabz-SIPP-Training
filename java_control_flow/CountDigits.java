package Java_Control_Flows;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, count = 0;

        System.out.print("Enter an integer: ");
        number = scanner.nextInt();
        int temp = number;

        if (number == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
        scanner.close();
    }
}

