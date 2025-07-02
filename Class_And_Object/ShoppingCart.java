package OOPS_Class_And_Object;

import java.util.ArrayList;
import java.util.Iterator;

// Class to represent each product in the cart
class ProductItem {
    private String productName;
    private double price;
    private int quantity;

    // Constructor
    public ProductItem(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getProductName() {
        return productName;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public void displayItem() {
        System.out.println(productName + " - ₹" + price + " x " + quantity);
    }
}

// Class to manage the shopping cart
public class ShoppingCart {
    private ArrayList<ProductItem> productList;

    // Constructor
    public ShoppingCart() {
        productList = new ArrayList<>();
    }

    // Add an item to the cart
    public void addItem(ProductItem item) {
        productList.add(item);
        System.out.println(item.getProductName() + " added to cart.");
    }

    // Remove an item from the cart by name
    public void removeItem(String productName) {
        Iterator<ProductItem> iterator = productList.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            ProductItem item = iterator.next();
            if (item.getProductName().equalsIgnoreCase(productName)) {
                iterator.remove();
                System.out.println(productName + " removed from cart.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(productName + " not found in cart.");
        }
    }

    // Display all items and the total cost
    public void displayCart() {
        double total = 0;

        if (productList.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("\nCart Contents:");
            for (ProductItem item : productList) {
                item.displayItem();
                total += item.getTotalCost();
            }
            System.out.println("Total Cost: ₹" + total);
        }
    }

    // Main method to test the cart
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        ProductItem item1 = new ProductItem("Laptop", 50000, 1);
        ProductItem item2 = new ProductItem("Headphones", 1500, 2);
        ProductItem item3 = new ProductItem("Mouse", 600, 1);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        cart.displayCart();

        cart.removeItem("Headphones");
        cart.displayCart();
    }
}
