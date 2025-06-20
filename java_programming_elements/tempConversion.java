package Java_Programming_Elements;

import java.util.Scanner;

//Create class to convert temperature from Celsius to Fahrenheit
class TemperatureConversion {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     // Declare variable to hold temperature in Celsius
     double celsius;

     // Take user input for Celsius
     System.out.print("Enter temperature in Celsius: ");
     celsius = input.nextDouble();

     // Calculate Fahrenheit using the formula
     double fahrenheitResult = (celsius * 9 / 5) + 32;

     // Display the result
     System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
 }
}
