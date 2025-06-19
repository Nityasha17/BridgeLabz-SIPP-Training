package Java_Arrays;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int totalEmployees = 10;

        double[] salary = new double[totalEmployees];
        double[] service = new double[totalEmployees];
        double[] bonus = new double[totalEmployees];
        double[] newSalary = new double[totalEmployees];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < totalEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("Enter Salary: ");
            salary[i] = scanner.nextDouble();

            System.out.print("Enter Years of Service: ");
            service[i] = scanner.nextDouble();

            if (salary[i] <= 0 || service[i] < 0) {
                System.out.println("Invalid input. Re-enter data for this employee.");
                i--;
                continue;
            }

            if (service[i] > 5) {
                bonus[i] = 0.05 * salary[i];
            } else {
                bonus[i] = 0.02 * salary[i];
            }

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nTotal Bonus Paid by Zara: ₹" + totalBonus);
        System.out.println("Total Old Salary: ₹" + totalOldSalary);
        System.out.println("Total New Salary after Bonus: ₹" + totalNewSalary);
    }
}
