package Java_Strings;

import java.util.Scanner;

public class VotingEligibility {

    // Method 1: Get ages for n students
    public static int[] getStudentAges(int numberOfStudents) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }
        return ages;
    }

    // Method 2: Return 2D array with age and eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    // Method 3: Display 2D array in table
    public static void displayVotingTable(String[][] data) {
        System.out.printf("%-10s%-15s\n", "Age", "Eligibility");
        System.out.println("-----------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s%-15s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = getStudentAges(10);
        String[][] result = checkVotingEligibility(ages);
        displayVotingTable(result);
    }
}
