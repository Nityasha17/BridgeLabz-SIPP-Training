package Java_Strings;

import java.util.Scanner;

public class RockPaperScissors {

    // Method 1: Get computer choice (0 = rock, 1 = paper, 2 = scissors)
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        return switch (choice) {
            case 0 -> "rock";
            case 1 -> "paper";
            default -> "scissors";
        };
    }

    // Method 2: Determine winner (returns "User", "Computer", or "Draw")
    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";

        return switch (user) {
            case "rock" -> computer.equals("scissors") ? "User" : "Computer";
            case "paper" -> computer.equals("rock") ? "User" : "Computer";
            case "scissors" -> computer.equals("paper") ? "User" : "Computer";
            default -> "Invalid";
        };
    }

    // Method 3: Calculate win percentages and return 2D String array
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        double userPercent = ((double) userWins / totalGames) * 100;
        double computerPercent = ((double) computerWins / totalGames) * 100;

        String[][] stats = {
            {"Player Wins", String.valueOf(userWins), String.format("%.2f%%", userPercent)},
            {"Computer Wins", String.valueOf(computerWins), String.format("%.2f%%", computerPercent)},
            {"Draws", String.valueOf(totalGames - userWins - computerWins), "-"}
        };
        return stats;
    }

    // Method 4: Display results
    public static void displayResults(String[][] gameLog, String[][] stats) {
        System.out.printf("%-10s%-15s%-15s%-10s\n", "Game", "User Choice", "Computer Choice", "Winner");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < gameLog.length; i++) {
            System.out.printf("%-10d%-15s%-15s%-10s\n", (i + 1), gameLog[i][0], gameLog[i][1], gameLog[i][2]);
        }

        System.out.println("\nSummary:");
        System.out.printf("%-15s%-15s%-15s\n", "Category", "Count", "Percentage");
        System.out.println("--------------------------------------------------");
        for (String[] row : stats) {
            System.out.printf("%-15s%-15s%-15s\n", row[0], row[1], row[2]);
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of games to play: ");
        int totalGames = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[][] gameLog = new String[totalGames][3]; // User, Computer, Winner
        int userWins = 0, computerWins = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.print("\nRound " + (i + 1) + " - Enter rock/paper/scissors: ");
            String userChoice = scanner.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = getWinner(userChoice, computerChoice);

            gameLog[i][0] = userChoice;
            gameLog[i][1] = computerChoice;
            gameLog[i][2] = winner;

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
        }

        String[][] stats = calculateStats(userWins, computerWins, totalGames);
        System.out.println();
        displayResults(gameLog, stats);

        scanner.close();
    }
}

