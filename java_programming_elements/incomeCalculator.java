package Java_Programming_Elements;

import java.util.Scanner;

//Create class to calculate total income from salary and bonus
class TotalIncomeCalculator {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     // Declare variables for salary and bonus
     double salary, bonus;

     // Take user input for salary
     System.out.print("Enter salary (INR): ");
     salary = input.nextDouble();

     // Take user input for bonus
     System.out.print("Enter bonus (INR): ");
     bonus = input.nextDouble();

     // Calculate total income
     double totalIncome = salary + bonus;

     // Display the result
     System.out.println("The salary is INR " + salary + " and the bonus is INR " + bonus +
         ". Hence Total Income is INR " + totalIncome);
 }
}

