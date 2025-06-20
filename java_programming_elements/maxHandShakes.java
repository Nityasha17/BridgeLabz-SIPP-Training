package Java_Programming_Elements;

import java.util.Scanner;

//Create class to calculate max number of handshakes
class MaxHandshakes {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     int numberOfStudents;

     System.out.print("Enter number of students: ");
     numberOfStudents = input.nextInt();

     int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

     System.out.println("The maximum number of handshakes possible is " + maxHandshakes);
 }
}