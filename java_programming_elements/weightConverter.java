package Java_Programming_Elements;

import java.util.Scanner;

//Create class to convert weight from pounds to kilograms
class WeightConverter {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     // Declare variable for weight in pounds
     double weightInPounds;

     // Take user input
     System.out.print("Enter weight in pounds: ");
     weightInPounds = input.nextDouble();

     // Conversion factor: 1 pound = 2.2 kg
     double weightInKg = weightInPounds / 2.2;

     // Display result
     System.out.println("The weight of the person in pounds is " + weightInPounds +
         " and in kg is " + weightInKg);
 }
}
