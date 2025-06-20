package Java_Methods;

import java.util.Scanner;

public class TrigonometricFunctions{

    public static double[] calculateTrigonometricFunctions(double angleInDegrees) {
        double radians = Math.toRadians(angleInDegrees);
        return new double[]{
            Math.sin(radians),
            Math.cos(radians),
            Math.tan(radians)
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();

        double[] results = calculateTrigonometricFunctions(angle);
        System.out.printf("Sine: %.4f%nCosine: %.4f%nTangent: %.4f%n", results[0], results[1], results[2]);
    }
}
