package Java_Strings;

import java.util.Scanner;

public class ArrayIndexDemo {

    public static void generateException(String[] names, int index) {
        System.out.println("Accessed element: " + names[index]);  // May throw exception
    }

    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Handled element: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid index.");
        } catch (Exception e) {
            System.out.println("Caught a general exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        System.out.print("Enter index to access: ");
        int index = scanner.nextInt();

        // generateException(names, index); // uncomment to see crash
        handleException(names, index);

        scanner.close();
    }
}
