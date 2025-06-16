package Java_Programming_Elements;

import java.util.Scanner;

//Create class to perform integer operations and demonstrate operator precedence
class IntOperation {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     // Declare variables a, b, and c of int data type
     int a, b, c;

     // Take user input for a, b, and c
     System.out.print("Enter value for a: ");
     a = input.nextInt();

     System.out.print("Enter value for b: ");
     b = input.nextInt();

     System.out.print("Enter value for c: ");
     c = input.nextInt();

     // Perform integer operations based on operator precedence
     int result1 = a + b * c;        // Multiplication happens before addition
     int result2 = a * b + c;        // Multiplication before addition
     int result3 = c + a / b;        // Division before addition
     int result4 = a % b + c;        // Modulus before addition

     // Display the results
     System.out.println("The results of Int Operations are:");
     System.out.println("a + b * c = " + result1);
     System.out.println("a * b + c = " + result2);
     System.out.println("c + a / b = " + result3);
     System.out.println("a % b + c = " + result4);
 }
}
