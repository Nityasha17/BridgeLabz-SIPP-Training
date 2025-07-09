package DSA_LinkedList;


//Node class for Movie
class MovieNode {
 String title;
 String director;
 int year;
 double rating;
 MovieNode prev;
 MovieNode next;

 public MovieNode(String title, String director, int year, double rating) {
     this.title = title;
     this.director = director;
     this.year = year;
     this.rating = rating;
 }
}

//Manager class for the Doubly Linked List
public class MovieListManager {
 private MovieNode head;
 private MovieNode tail;

 // Add movie at beginning
 public void addAtBeginning(String title, String director, int year, double rating) {
     MovieNode newNode = new MovieNode(title, director, year, rating);
     if (head == null) {
         head = tail = newNode;
     } else {
         newNode.next = head;
         head.prev = newNode;
         head = newNode;
     }
 }

 // Add movie at end
 public void addAtEnd(String title, String director, int year, double rating) {
     MovieNode newNode = new MovieNode(title, director, year, rating);
     if (tail == null) {
         head = tail = newNode;
     } else {
         tail.next = newNode;
         newNode.prev = tail;
         tail = newNode;
     }
 }

 // Add movie at specific position (0-based index)
 public void addAtPosition(int index, String title, String director, int year, double rating) {
     if (index < 0) {
         System.out.println("Invalid index.");
         return;
     }
     if (index == 0) {
         addAtBeginning(title, director, year, rating);
         return;
     }
     MovieNode newNode = new MovieNode(title, director, year, rating);
     MovieNode current = head;
     for (int i = 0; current != null && i < index - 1; i++) {
         current = current.next;
     }
     if (current == null || current.next == null) {
         addAtEnd(title, director, year, rating);
         return;
     }
     newNode.next = current.next;
     newNode.prev = current;
     current.next.prev = newNode;
     current.next = newNode;
 }

 // Remove movie by title
 public void removeByTitle(String title) {
     MovieNode current = head;
     while (current != null) {
         if (current.title.equalsIgnoreCase(title)) {
             if (current == head) {
                 head = current.next;
                 if (head != null) head.prev = null;
                 else tail = null;
             } else if (current == tail) {
                 tail = current.prev;
                 tail.next = null;
             } else {
                 current.prev.next = current.next;
                 current.next.prev = current.prev;
             }
             System.out.println("Movie removed: " + title);
             return;
         }
         current = current.next;
     }
     System.out.println("Movie not found: " + title);
 }

 // Search by director
 public void searchByDirector(String director) {
     MovieNode current = head;
     boolean found = false;
     while (current != null) {
         if (current.director.equalsIgnoreCase(director)) {
             System.out.println("Title: " + current.title + ", Rating: " + current.rating);
             found = true;
         }
         current = current.next;
     }
     if (!found) System.out.println("No movies found by director: " + director);
 }

 // Search by rating
 public void searchByRating(double rating) {
     MovieNode current = head;
     boolean found = false;
     while (current != null) {
         if (current.rating == rating) {
             System.out.println("Title: " + current.title + ", Director: " + current.director);
             found = true;
         }
         current = current.next;
     }
     if (!found) System.out.println("No movies found with rating: " + rating);
 }

 // Update movie rating
 public void updateRating(String title, double newRating) {
     MovieNode current = head;
     while (current != null) {
         if (current.title.equalsIgnoreCase(title)) {
             current.rating = newRating;
             System.out.println("Updated rating for " + title);
             return;
         }
         current = current.next;
     }
     System.out.println("Movie not found: " + title);
 }

 // Display forward
 public void displayForward() {
     if (head == null) {
         System.out.println("No movies to display.");
         return;
     }
     MovieNode current = head;
     while (current != null) {
         System.out.println(current.title + " | " + current.director + " | " + current.year + " | " + current.rating);
         current = current.next;
     }
 }

 // Display reverse
 public void displayReverse() {
     if (tail == null) {
         System.out.println("No movies to display.");
         return;
     }
     MovieNode current = tail;
     while (current != null) {
         System.out.println(current.title + " | " + current.director + " | " + current.year + " | " + current.rating);
         current = current.prev;
     }
 }

 // Main method for testing
 public static void main(String[] args) {
     MovieListManager manager = new MovieListManager();

     manager.addAtEnd("Inception", "Christopher Nolan", 2010, 9.0);
     manager.addAtBeginning("Interstellar", "Christopher Nolan", 2014, 8.6);
     manager.addAtPosition(1, "Parasite", "Bong Joon-ho", 2019, 8.6);
     manager.displayForward();

     System.out.println("\nReverse Order:");
     manager.displayReverse();

     System.out.println("\nUpdating rating...");
     manager.updateRating("Parasite", 9.1);

     System.out.println("\nSearch by Director:");
     manager.searchByDirector("Christopher Nolan");

     System.out.println("\nRemoving movie:");
     manager.removeByTitle("Inception");

     System.out.println("\nFinal Movie List:");
     manager.displayForward();
 }
}
