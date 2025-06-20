package Java_Methods;

import java.util.Random;

public class MatrixManipulation {

    // Generate a random matrix of given rows and columns
    public static int[][] generateRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // 0 to 9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // Method to print matrix with label
    public static void printMatrix(int[][] matrix, String label) {
        System.out.println(label + ":");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%4d", value);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int rows = 3, cols = 3;

        int[][] matrixA = generateRandomMatrix(rows, cols);
        int[][] matrixB = generateRandomMatrix(rows, cols);

        printMatrix(matrixA, "Matrix A");
        printMatrix(matrixB, "Matrix B");

        int[][] sum = addMatrices(matrixA, matrixB);
        int[][] difference = subtractMatrices(matrixA, matrixB);
        int[][] productAB = multiplyMatrices(matrixA, matrixB);
        int[][] productBA = multiplyMatrices(matrixB, matrixA);

        printMatrix(sum, "A + B");
        printMatrix(difference, "A - B");
        printMatrix(productAB, "A * B");
        printMatrix(productBA, "B * A");
    }
}
