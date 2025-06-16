package Java_Programming_Elements;

import java.util.Scanner;

//Create class to swap two numbers entered by the user
class SwapNumbers {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     // Declare variables to hold two numbers
     int number1, number2, temp;

     // Take user input for number1
     System.out.print("Enter the first number: ");
     number1 = input.nextInt();

     // Take user input for number2
     System.out.print("Enter the second number: ");
     number2 = input.nextInt();

     // Display original numbers
     System.out.println("Original numbers are: " + number1 + " and " + number2);

     // Swap the values using a temporary variable
     temp = number1;
     number1 = number2;
     number2 = temp;

     // Display the swapped result
     System.out.println("The swapped numbers are " + number1 + " and " + number2);
 }
}
