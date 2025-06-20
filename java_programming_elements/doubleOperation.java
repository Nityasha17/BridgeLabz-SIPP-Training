package Java_Programming_Elements;

import java.util.Scanner;

//Create class to perform operations on three double numbers
class DoubleOperation {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     // Declare variables a, b, and c
     double a, b, c;

     // Take user input for a, b, and c
     System.out.print("Enter value for a: ");
     a = input.nextDouble();

     System.out.print("Enter value for b: ");
     b = input.nextDouble();

     System.out.print("Enter value for c: ");
     c = input.nextDouble();

     // Perform operations using proper operator precedence
     double result1 = a + b * c;
     double result2 = a * b + c;
     double result3 = c + a / b;
     double result4 = a % b + c;

     // Display all results
     System.out.println("The results of Double Operations are:");
     System.out.println("a + b * c = " + result1);
     System.out.println("a * b + c = " + result2);
     System.out.println("c + a / b = " + result3);
     System.out.println("a % b + c = " + result4);
 }
}

