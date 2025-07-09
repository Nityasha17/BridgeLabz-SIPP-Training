package DSA_LinkedList;


//Node class for Book
class BookNode {
 String title;
 String author;
 String genre;
 int bookId;
 boolean isAvailable;
 BookNode prev;
 BookNode next;

 public BookNode(String title, String author, String genre, int bookId, boolean isAvailable) {
     this.title = title;
     this.author = author;
     this.genre = genre;
     this.bookId = bookId;
     this.isAvailable = isAvailable;
 }
}

//Manager class for the Doubly Linked List
public class LibraryManager {
 private BookNode head;
 private BookNode tail;

 // Add book at beginning
 public void addAtBeginning(String title, String author, String genre, int id, boolean available) {
     BookNode newNode = new BookNode(title, author, genre, id, available);
     if (head == null) {
         head = tail = newNode;
     } else {
         newNode.next = head;
         head.prev = newNode;
         head = newNode;
     }
 }

 // Add book at end
 public void addAtEnd(String title, String author, String genre, int id, boolean available) {
     BookNode newNode = new BookNode(title, author, genre, id, available);
     if (tail == null) {
         head = tail = newNode;
     } else {
         tail.next = newNode;
         newNode.prev = tail;
         tail = newNode;
     }
 }

 // Add book at specific position (0-based)
 public void addAtPosition(int index, String title, String author, String genre, int id, boolean available) {
     if (index <= 0) {
         addAtBeginning(title, author, genre, id, available);
         return;
     }

     BookNode newNode = new BookNode(title, author, genre, id, available);
     BookNode current = head;

     for (int i = 0; i < index - 1 && current != null; i++) {
         current = current.next;
     }

     if (current == null || current.next == null) {
         addAtEnd(title, author, genre, id, available);
         return;
     }

     newNode.next = current.next;
     newNode.prev = current;
     current.next.prev = newNode;
     current.next = newNode;
 }

 // Remove book by ID
 public void removeByBookId(int bookId) {
     if (head == null) {
         System.out.println("Library is empty.");
         return;
     }

     BookNode current = head;

     while (current != null && current.bookId != bookId) {
         current = current.next;
     }

     if (current == null) {
         System.out.println("Book not found.");
         return;
     }

     if (current == head) {
         head = current.next;
         if (head != null) head.prev = null;
         else tail = null;
     } else if (current == tail) {
         tail = current.prev;
         if (tail != null) tail.next = null;
     } else {
         current.prev.next = current.next;
         current.next.prev = current.prev;
     }

     System.out.println("Book with ID " + bookId + " removed.");
 }

 // Search by title or author
 public void searchBook(String keyword) {
     BookNode current = head;
     boolean found = false;
     while (current != null) {
         if (current.title.equalsIgnoreCase(keyword) || current.author.equalsIgnoreCase(keyword)) {
             System.out.println("Found: " + current.title + " | Author: " + current.author +
                     " | Genre: " + current.genre + " | ID: " + current.bookId +
                     " | Available: " + (current.isAvailable ? "Yes" : "No"));
             found = true;
         }
         current = current.next;
     }
     if (!found) {
         System.out.println("No book found matching: " + keyword);
     }
 }

 // Update availability
 public void updateAvailability(int bookId, boolean newStatus) {
     BookNode current = head;
     while (current != null) {
         if (current.bookId == bookId) {
             current.isAvailable = newStatus;
             System.out.println("Availability updated.");
             return;
         }
         current = current.next;
     }
     System.out.println("Book ID not found.");
 }

 // Display all books forward
 public void displayForward() {
     if (head == null) {
         System.out.println("Library is empty.");
         return;
     }

     BookNode current = head;
     while (current != null) {
         System.out.println("Title: " + current.title + ", Author: " + current.author +
                 ", Genre: " + current.genre + ", ID: " + current.bookId +
                 ", Available: " + (current.isAvailable ? "Yes" : "No"));
         current = current.next;
     }
 }

 // Display all books reverse
 public void displayReverse() {
     if (tail == null) {
         System.out.println("Library is empty.");
         return;
     }

     BookNode current = tail;
     while (current != null) {
         System.out.println("Title: " + current.title + ", Author: " + current.author +
                 ", Genre: " + current.genre + ", ID: " + current.bookId +
                 ", Available: " + (current.isAvailable ? "Yes" : "No"));
         current = current.prev;
     }
 }

 // Count total number of books
 public int countBooks() {
     int count = 0;
     BookNode current = head;
     while (current != null) {
         count++;
         current = current.next;
     }
     return count;
 }

 // Main method for testing
 public static void main(String[] args) {
     LibraryManager manager = new LibraryManager();

     manager.addAtEnd("The Alchemist", "Paulo Coelho", "Fiction", 1001, true);
     manager.addAtBeginning("1984", "George Orwell", "Dystopia", 1002, false);
     manager.addAtPosition(1, "The Hobbit", "J.R.R. Tolkien", "Fantasy", 1003, true);

     System.out.println("Library (Forward):");
     manager.displayForward();

     System.out.println("\nLibrary (Reverse):");
     manager.displayReverse();

     System.out.println("\nTotal Books: " + manager.countBooks());

     System.out.println("\nSearching by Author 'Paulo Coelho':");
     manager.searchBook("Paulo Coelho");

     System.out.println("\nUpdating availability of Book ID 1002 to Available...");
     manager.updateAvailability(1002, true);

     System.out.println("\nRemoving Book ID 1003...");
     manager.removeByBookId(1003);

     System.out.println("\nFinal Library List:");
     manager.displayForward();
 }
}

