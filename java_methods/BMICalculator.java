package Java_Methods;

import java.util.Scanner;

public class BMICalculator {

    public static void calculateBMI(double[][] members) {
        for (int i = 0; i < members.length; i++) {
            double weight = members[i][0];
            double heightInMeters = members[i][1] / 100;
            double bmi = weight / (heightInMeters * heightInMeters);
            members[i][2] = bmi;
        }
    }

    public static String[] determineBMIStatus(double[][] members) {
        String[] status = new String[members.length];
        for (int i = 0; i < members.length; i++) {
            double bmi = members[i][2];
            if (bmi < 18.5)
                status[i] = "Underweight";
            else if (bmi < 25)
                status[i] = "Normal weight";
            else if (bmi < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] members = new double[10][3]; // weight, height(cm), bmi

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of member " + (i + 1) + ": ");
            members[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) of member " + (i + 1) + ": ");
            members[i][1] = scanner.nextDouble();
        }

        calculateBMI(members);
        String[] statuses = determineBMIStatus(members);

        System.out.println("\nMember Details:");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", members[i][0], members[i][1], members[i][2], statuses[i]);
        }
    }
}
