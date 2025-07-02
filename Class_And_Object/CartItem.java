package OOPS_Class_And_Object;

public class CartItem {
    private int itemCode;
    private String itemName;
    private double price;

    public CartItem(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Unit Price: ₹" + price);
        System.out.println("Total Cost for " + quantity + " items: ₹" + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem item = new CartItem(101, "USB Cable", 150.75);
        item.displayDetails(3);
    }
}
