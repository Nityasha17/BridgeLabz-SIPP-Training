package DSA_LinkedList;

//Node class for Inventory Item
class InventoryItemNode {
 String itemName;
 int itemId;
 int quantity;
 double price;
 InventoryItemNode next;

 public InventoryItemNode(String itemName, int itemId, int quantity, double price) {
     this.itemName = itemName;
     this.itemId = itemId;
     this.quantity = quantity;
     this.price = price;
 }
}

//Manager class for inventory operations
public class InventoryManager {
 private InventoryItemNode head;

 // Add at beginning
 public void addAtBeginning(String name, int id, int qty, double price) {
     InventoryItemNode newNode = new InventoryItemNode(name, id, qty, price);
     newNode.next = head;
     head = newNode;
 }

 // Add at end
 public void addAtEnd(String name, int id, int qty, double price) {
     InventoryItemNode newNode = new InventoryItemNode(name, id, qty, price);
     if (head == null) {
         head = newNode;
         return;
     }
     InventoryItemNode current = head;
     while (current.next != null) {
         current = current.next;
     }
     current.next = newNode;
 }

 // Add at specific position (0-based)
 public void addAtPosition(int index, String name, int id, int qty, double price) {
     if (index <= 0) {
         addAtBeginning(name, id, qty, price);
         return;
     }

     InventoryItemNode newNode = new InventoryItemNode(name, id, qty, price);
     InventoryItemNode current = head;

     for (int i = 0; i < index - 1 && current != null; i++) {
         current = current.next;
     }

     if (current == null) {
         System.out.println("Position out of bounds.");
         return;
     }

     newNode.next = current.next;
     current.next = newNode;
 }

 // Remove item by ID
 public void removeById(int itemId) {
     if (head == null) {
         System.out.println("List is empty.");
         return;
     }

     if (head.itemId == itemId) {
         head = head.next;
         return;
     }

     InventoryItemNode current = head;
     while (current.next != null && current.next.itemId != itemId) {
         current = current.next;
     }

     if (current.next == null) {
         System.out.println("Item ID not found.");
     } else {
         current.next = current.next.next;
     }
 }

 // Update quantity by ID
 public void updateQuantity(int itemId, int newQty) {
     InventoryItemNode current = head;
     while (current != null) {
         if (current.itemId == itemId) {
             current.quantity = newQty;
             System.out.println("Quantity updated.");
             return;
         }
         current = current.next;
     }
     System.out.println("Item not found.");
 }

 // Search by ID or name
 public void searchItem(String keyword) {
     InventoryItemNode current = head;
     boolean found = false;
     while (current != null) {
         if (String.valueOf(current.itemId).equals(keyword) || current.itemName.equalsIgnoreCase(keyword)) {
             System.out.println("Found: " + current.itemName + " | ID: " + current.itemId + " | Qty: " +
                     current.quantity + " | Price: ₹" + current.price);
             found = true;
         }
         current = current.next;
     }
     if (!found) System.out.println("Item not found.");
 }

 // Calculate total inventory value
 public double calculateTotalValue() {
     double total = 0.0;
     InventoryItemNode current = head;
     while (current != null) {
         total += current.quantity * current.price;
         current = current.next;
     }
     return total;
 }

 // Display all items
 public void displayAllItems() {
     if (head == null) {
         System.out.println("No inventory items.");
         return;
     }

     InventoryItemNode current = head;
     while (current != null) {
         System.out.println("Item: " + current.itemName + " | ID: " + current.itemId +
                 " | Qty: " + current.quantity + " | Price: ₹" + current.price);
         current = current.next;
     }
 }

 // Sort by item name or price (ascending)
 public void sortInventory(String sortBy) {
     head = mergeSort(head, sortBy);
 }

 private InventoryItemNode mergeSort(InventoryItemNode head, String sortBy) {
     if (head == null || head.next == null) return head;

     InventoryItemNode mid = getMid(head);
     InventoryItemNode right = mid.next;
     mid.next = null;

     InventoryItemNode leftSorted = mergeSort(head, sortBy);
     InventoryItemNode rightSorted = mergeSort(right, sortBy);

     return merge(leftSorted, rightSorted, sortBy);
 }

 private InventoryItemNode merge(InventoryItemNode a, InventoryItemNode b, String sortBy) {
     InventoryItemNode dummy = new InventoryItemNode("", 0, 0, 0);
     InventoryItemNode tail = dummy;

     while (a != null && b != null) {
         boolean condition;
         if (sortBy.equalsIgnoreCase("name")) {
             condition = a.itemName.compareToIgnoreCase(b.itemName) <= 0;
         } else {
             condition = a.price <= b.price;
         }

         if (condition) {
             tail.next = a;
             a = a.next;
         } else {
             tail.next = b;
             b = b.next;
         }
         tail = tail.next;
     }
     tail.next = (a != null) ? a : b;
     return dummy.next;
 }

 private InventoryItemNode getMid(InventoryItemNode node) {
     InventoryItemNode slow = node, fast = node.next;
     while (fast != null && fast.next != null) {
         slow = slow.next;
         fast = fast.next.next;
     }
     return slow;
 }

 // Main method for testing
 public static void main(String[] args) {
     InventoryManager manager = new InventoryManager();

     manager.addAtEnd("Pen", 101, 100, 5.0);
     manager.addAtBeginning("Notebook", 102, 50, 40.0);
     manager.addAtPosition(1, "Marker", 103, 30, 15.0);

     System.out.println("Inventory Items:");
     manager.displayAllItems();

     System.out.println("\nTotal Value: ₹" + manager.calculateTotalValue());

     System.out.println("\nSorting by Name:");
     manager.sortInventory("name");
     manager.displayAllItems();

     System.out.println("\nUpdating Quantity for ID 103:");
     manager.updateQuantity(103, 60);
     manager.displayAllItems();

     System.out.println("\nRemoving Item ID 101:");
     manager.removeById(101);
     manager.displayAllItems();
 }
}
