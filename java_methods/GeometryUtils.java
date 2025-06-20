package Java_Methods;

import java.util.Scanner;

public class GeometryUtils {

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - (slope * x1);
        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f%n", distance);

        if (x1 == x2) {
            System.out.println("Vertical line: slope is undefined, equation is x = " + x1);
        } else {
            double[] line = calculateLineEquation(x1, y1, x2, y2);
            System.out.printf("Equation of line: y = %.2fx + %.2f%n", line[0], line[1]);
        }
    }
}
