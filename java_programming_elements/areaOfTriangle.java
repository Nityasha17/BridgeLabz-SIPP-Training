package Java_Programming_Elements;

import java.util.Scanner;

//Create class to calculate area of triangle in square cm and inches
class TriangleAreaCalculator {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     double base, height;

     System.out.print("Enter base in cm: ");
     base = input.nextDouble();

     System.out.print("Enter height in cm: ");
     height = input.nextDouble();

     double areaCm2 = 0.5 * base * height;
     double areaIn2 = areaCm2 / 6.4516;

     System.out.println("Area of Triangle is " + areaCm2 +
         " square cm and " + areaIn2 + " square inches");
 }
}
