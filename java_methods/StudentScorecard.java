package Java_Methods;

import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {

    // Method to generate random marks (2-digit) for PCM
    public static int[][] generatePCMScores(int numberOfStudents) {
        Random rand = new Random();
        int[][] scores = new int[numberOfStudents][3]; // 0 = Physics, 1 = Chemistry, 2 = Math

        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 40 + rand.nextInt(61); // Range: 40–100
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateScoreMetrics(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3]; // 0 = Total, 1 = Average, 2 = Percentage

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to determine grade based on percentage
    public static String getGradeRemark(double percentage) {
        if (percentage >= 80) return "A (Level 4)";
        else if (percentage >= 70) return "B (Level 3)";
        else if (percentage >= 60) return "C (Level 2)";
        else if (percentage >= 50) return "D (Level 1)";
        else if (percentage >= 40) return "E (Level 1-)";
        else return "R (Remedial)";
    }

    // Method to display the scorecard
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("Roll\tPhysics\tChem\tMaths\tTotal\tAvg\t%\tGrade");
        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t");
            System.out.print((int)results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "\t");
            System.out.println(getGradeRemark(results[i][2]));
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        int[][] pcmScores = generatePCMScores(numberOfStudents);
        double[][] scoreMetrics = calculateScoreMetrics(pcmScores);
        displayScoreCard(pcmScores, scoreMetrics);

        sc.close();
    }
}

