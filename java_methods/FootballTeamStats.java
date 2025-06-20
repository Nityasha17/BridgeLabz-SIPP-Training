package Java_Methods;

import java.util.Random;

public class FootballTeamStats {

    // Generate random heights between 150 and 250 cm
    public static int[] generateHeights(int numberOfPlayers) {
        int[] heights = new int[numberOfPlayers];
        Random rand = new Random();
        for (int i = 0; i < numberOfPlayers; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150 to 250
        }
        return heights;
    }

    public static int sumOfHeights(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    public static double meanHeight(int[] heights) {
        return (double) sumOfHeights(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) min = h;
        }
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) max = h;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);

        System.out.println("Player Heights (in cm):");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        System.out.println("\n\nTotal Height: " + sumOfHeights(heights) + " cm");
        System.out.printf("Mean Height: %.2f cm%n", meanHeight(heights));
        System.out.println("Shortest Player: " + findShortest(heights) + " cm");
        System.out.println("Tallest Player: " + findTallest(heights) + " cm");
    }
}
