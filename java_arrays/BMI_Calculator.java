package Java_Arrays;

import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input number of persons
        System.out.print("Enter the number of team members: ");
        int totalPersons = scanner.nextInt();

        // Step 2: Declare arrays
        double[] height = new double[totalPersons];  // in meters
        double[] weight = new double[totalPersons];  // in kilograms
        double[] bmi = new double[totalPersons];
        String[] status = new String[totalPersons];

        // Step 3–4: Input height and weight, compute BMI and status
        for (int i = 0; i < totalPersons; i++) {
            System.out.println("\nTeam Member " + (i + 1));

            System.out.print("Enter height (in meters): ");
            height[i] = scanner.nextDouble();

            System.out.print("Enter weight (in kilograms): ");
            weight[i] = scanner.nextDouble();

            // Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine BMI Status
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Step 5: Display results
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < totalPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", height[i], weight[i], bmi[i], status[i]);
        }
    }
}
