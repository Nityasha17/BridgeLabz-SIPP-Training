package Java_Methods;

import java.util.Random;

public class RandomStats {

    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + random.nextInt(9000); // 1000 to 9999
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        double avg = sum / (double) numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        System.out.print("Generated Numbers: ");
        for (int num : numbers) System.out.print(num + " ");
        System.out.println();

        double[] result = findAverageMinMax(numbers);
        System.out.printf("Average: %.2f, Min: %.0f, Max: %.0f%n", result[0], result[1], result[2]);
    }
}
