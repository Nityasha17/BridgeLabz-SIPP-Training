package Java_Arrays;

import java.util.Scanner;

public class Matrix_To_1D_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] flatArray = new int[rows * cols];
        int index = 0;

        // Input 2D matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter value for [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
                flatArray[index++] = matrix[i][j];
            }
        }

        // Display 1D array
        System.out.print("Flattened Array: ");
        for (int i = 0; i < flatArray.length; i++) {
            System.out.print(flatArray[i] + " ");
        }
    }
}
