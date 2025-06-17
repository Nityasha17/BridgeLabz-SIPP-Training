package Java_Control_Flows;

import java.util.Scanner;

public class LeapYearMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year (>=1582): ");
        int year = scanner.nextInt();

        if (year < 1582) {
            System.out.println("Year must be >= 1582 (Gregorian Calendar)");
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is Not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is Not a Leap Year.");
            }
        }

        scanner.close();
    }
}
