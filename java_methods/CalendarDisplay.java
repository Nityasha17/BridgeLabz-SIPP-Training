package Java_Methods;

import java.util.Scanner;

public class CalendarDisplay {

    // Method to get the month name
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in the given month/year
    public static int getNumberOfDays(int month, int year) {
        int[] days = {
            31, 28, 31, 30, 31, 30, 
            31, 31, 30, 31, 30, 31
        };

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    // Method to get the first day of the month (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
    public static int getStartDay(int month, int year) {
        // Using Zeller's Congruence algorithm
        if (month < 3) {
            month += 12;
            year -= 1;
        }

        int q = 1; // Day of month = 1st
        int m = month;
        int k = year % 100;
        int j = year / 100;

        int h = (q + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        return (h + 6) % 7; // Convert from Zeller's (0=Saturday) to (0=Sunday)
    }

    // Method to print the calendar
    public static void printCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int days = getNumberOfDays(month, year);
        int startDay = getStartDay(month, year);

        System.out.printf("\n  %s %d\n", monthName, year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print leading spaces for the first week
        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        // Print all days of the month
        for (int date = 1; date <= days; date++) {
            System.out.printf("%2d ", date);
            if ((date + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1–12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Validate input
        if (month < 1 || month > 12 || year < 1582) {
            System.out.println("Invalid input. Month must be 1–12 and year >= 1582.");
        } else {
            printCalendar(month, year);
        }

        scanner.close();
    }
}
