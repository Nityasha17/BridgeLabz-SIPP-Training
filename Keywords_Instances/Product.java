package OOPS_Keywords_Instances;

public class Product {
    private String productName;
    private double price;
    private int quantity;
    private final String productID; // final

    private static double discount = 10.0; // shared discount in %

    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName; // this
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public void displayProductDetails() {
        if (this instanceof Product) { // instanceof
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: ₹" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
}
