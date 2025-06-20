package Java_Programming_Elements;

import java.util.Scanner;

//Create class to compute quotient and remainder of two numbers
class QuotientRemainder {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     // Declare variables for the two input numbers
     int number1, number2;

     // Take user input for number1
     System.out.print("Enter first number: ");
     number1 = input.nextInt();

     // Take user input for number2
     System.out.print("Enter second number: ");
     number2 = input.nextInt();

     // Calculate quotient and remainder
     int quotient = number1 / number2;
     int remainder = number1 % number2;

     // Display the result
     System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +
                        " of two numbers " + number1 + " and " + number2);
 }
}
