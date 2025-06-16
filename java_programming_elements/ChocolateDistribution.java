package Java_Programming_Elements;

import java.util.Scanner;

//Create class to divide chocolates among children
class ChocolateDistribution {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     // Declare variables for number of chocolates and number of children
     int numberOfChocolates, numberOfChildren;

     // Take user input for numberOfChocolates
     System.out.print("Enter the total number of chocolates: ");
     numberOfChocolates = input.nextInt();

     // Take user input for numberOfChildren
     System.out.print("Enter the number of children: ");
     numberOfChildren = input.nextInt();

     // Calculate chocolates per child and remaining chocolates
     int chocolatesPerChild = numberOfChocolates / numberOfChildren;
     int remainingChocolates = numberOfChocolates % numberOfChildren;

     // Display the result
     System.out.println("The number of chocolates each child gets is " + chocolatesPerChild +
                        " and the number of remaining chocolates is " + remainingChocolates);
 }
}
