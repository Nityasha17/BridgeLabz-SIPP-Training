package Java_Programming_Elements;

import java.util.Scanner;

// Create class to calculate the number of rounds needed to complete a 5 km run in a triangular park
class TriangularParkRun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables for the sides of the triangular park in meters
        double side1, side2, side3;
        
        // Take user input for all three sides
        System.out.print("Enter length of side 1 in meters: ");
        side1 = input.nextDouble();

        System.out.print("Enter length of side 2 in meters: ");
        side2 = input.nextDouble();

        System.out.print("Enter length of side 3 in meters: ");
        side3 = input.nextDouble();

        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;

        // Total distance to run is 5 km = 5000 meters
        double totalDistanceToRun = 5000;

        // Calculate the number of rounds needed
        double numberOfRounds = totalDistanceToRun / perimeter;

        // Display the result
        System.out.println("The total number of rounds the athlete will run is " +
                           numberOfRounds + " to complete 5 km");
    }
}
