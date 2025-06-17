package Java_Control_Flows;

import java.util.Scanner;

public class YoungestTallest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Amar
        System.out.print("Enter Amar's age: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter Amar's height: ");
        int heightAmar = scanner.nextInt();

        // Input for Akbar
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter Akbar's height: ");
        int heightAkbar = scanner.nextInt();

        // Input for Anthony
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = scanner.nextInt();
        System.out.print("Enter Anthony's height: ");
        int heightAnthony = scanner.nextInt();

        // Youngest
        String youngestFriend;
        int minAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        if (minAge == ageAmar) {
            youngestFriend = "Amar";
        } else if (minAge == ageAkbar) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Tallest
        String tallestFriend;
        int maxHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        if (maxHeight == heightAmar) {
            tallestFriend = "Amar";
        } else if (maxHeight == heightAkbar) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);

        scanner.close();
    }
}
