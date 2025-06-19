package Java_Arrays;

import java.util.Scanner;

public class BMI_Multi_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input number of persons
        System.out.print("Enter the number of team members: ");
        int number = scanner.nextInt();

        double[][] personData = new double[number][3]; // [height, weight, BMI]
        String[] weightStatus = new String[number];

        // Step 2–3: Input values and calculate BMI
        for (int i = 0; i < number; i++) {
            System.out.println("\nTeam Member " + (i + 1));

            // Input and validation for height
            double height;
            while (true) {
                System.out.print("Enter height (in meters): ");
                height = scanner.nextDouble();
                if (height > 0) break;
                System.out.println("Height must be a positive value.");
            }

            // Input and validation for weight
            double weight;
            while (true) {
                System.out.print("Enter weight (in kilograms): ");
                weight = scanner.nextDouble();
                if (weight > 0) break;
                System.out.println("Weight must be a positive value.");
            }

            // Store height and weight
            personData[i][0] = height;
            personData[i][1] = weight;

            // Calculate and store BMI
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine weight status
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Step 4: Display results
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
