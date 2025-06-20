package Java_Methods;

import java.util.Random;

public class MatrixManipulator {

    // Method to generate a random square matrix
    public static double[][] generateRandomMatrix(int size) {
        Random rand = new Random();
        double[][] matrix = new double[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = rand.nextInt(10); // random values 0–9
            }
        }
        return matrix;
    }

    // Method to print matrix
    public static void printMatrix(double[][] matrix, String label) {
        System.out.println(label + ":");
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to find transpose
    public static double[][] transpose(double[][] matrix) {
        int size = matrix.length;
        double[][] result = new double[size][size];

        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                result[j][i] = matrix[i][j];

        return result;
    }

    // Method to find determinant of 2x2 matrix
    public static double determinant2x2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    // Method to find determinant of 3x3 matrix
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1]) -
               m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0]) +
               m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Method to find inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;
        return inv;
    }

    // Method to find inverse of 3x3 matrix using adjoint method
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;

        double[][] cofactor = new double[3][3];

        cofactor[0][0] = (m[1][1] * m[2][2] - m[1][2] * m[2][1]);
        cofactor[0][1] = -(m[1][0] * m[2][2] - m[1][2] * m[2][0]);
        cofactor[0][2] = (m[1][0] * m[2][1] - m[1][1] * m[2][0]);

        cofactor[1][0] = -(m[0][1] * m[2][2] - m[0][2] * m[2][1]);
        cofactor[1][1] = (m[0][0] * m[2][2] - m[0][2] * m[2][0]);
        cofactor[1][2] = -(m[0][0] * m[2][1] - m[0][1] * m[2][0]);

        cofactor[2][0] = (m[0][1] * m[1][2] - m[0][2] * m[1][1]);
        cofactor[2][1] = -(m[0][0] * m[1][2] - m[0][2] * m[1][0]);
        cofactor[2][2] = (m[0][0] * m[1][1] - m[0][1] * m[1][0]);

        double[][] adjoint = transpose(cofactor);
        double[][] inverse = new double[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inverse[i][j] = adjoint[i][j] / det;

        return inverse;
    }

    // Main Method
    public static void main(String[] args) {
        int size = 3; // Change to 2 for 2x2 matrix

        double[][] matrix = generateRandomMatrix(size);
        printMatrix(matrix, "Original Matrix");

        double[][] transposed = transpose(matrix);
        printMatrix(transposed, "Transpose");

        if (size == 2) {
            double det = determinant2x2(matrix);
            System.out.printf("Determinant: %.2f\n", det);
            if (det != 0) {
                double[][] inverse = inverse2x2(matrix);
                printMatrix(inverse, "Inverse");
            } else {
                System.out.println("Matrix is not invertible (determinant is zero).");
            }
        }

        if (size == 3) {
            double det = determinant3x3(matrix);
            System.out.printf("Determinant: %.2f\n", det);
            if (det != 0) {
                double[][] inverse = inverse3x3(matrix);
                printMatrix(inverse, "Inverse");
            } else {
                System.out.println("Matrix is not invertible (determinant is zero).");
            }
        }
    }
}
