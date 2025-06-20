package Java_Programming_Elements;

import java.util.Scanner;

//Create class to find square side from perimeter
class SquareSideCalculator {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     double perimeter;

     System.out.print("Enter the perimeter of square: ");
     perimeter = input.nextDouble();

     double side = perimeter / 4;

     System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
 }
}
