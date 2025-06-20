package Java_Programming_Elements;

import java.util.Scanner;

public class kmToMiles_UserInput {
	
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        double km; // Declare distance in km
	        double conversionFactor = 1.6;

	        // Take user input
	        System.out.print("Enter distance in kilometers: ");
	        km = input.nextDouble();

	        double miles = km * conversionFactor;

	        // Display output
	        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
	    }

}