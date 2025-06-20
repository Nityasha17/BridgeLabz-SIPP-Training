package Java_Programming_Elements;

import java.util.Scanner;

public class discountedFee_Input {
	
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        double fee, discountPercent;

	        // Take user input
	        System.out.print("Enter the student fee: ");
	        fee = input.nextDouble();

	        System.out.print("Enter the discount percentage: ");
	        discountPercent = input.nextDouble();

	        double discount = (fee * discountPercent) / 100;
	        double finalFee = fee - discount;

	        System.out.println("The discount amount is INR " + discount +
	            " and final discounted fee is INR " + finalFee);
	    }

}
