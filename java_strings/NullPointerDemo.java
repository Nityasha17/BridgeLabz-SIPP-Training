package Java_Strings;

public class NullPointerDemo {

    // Generates NullPointerException
    public static void generateException() {
        String text = null;
        System.out.println("Length: " + text.length()); // causes exception
    }

    // Handles NullPointerException
    public static void handleException() {
        try {
            String text = null;
            System.out.println("Length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Attempted to access method on null.");
        } catch (Exception e) {
            System.out.println("Caught general exception: " + e);
        }
    }

    public static void main(String[] args) {
        // generateException(); // uncomment to see crash
        handleException();
    }
}
