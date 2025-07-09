package DSA_LinkedList;


//Node class to represent each student
class StudentNode {
 int rollNumber;
 String name;
 int age;
 String grade;
 StudentNode next;

 public StudentNode(int rollNumber, String name, int age, String grade) {
     this.rollNumber = rollNumber;
     this.name = name;
     this.age = age;
     this.grade = grade;
     this.next = null;
 }
}

//Manager class for all linked list operations
public class StudentListManager {
 private StudentNode head;

 // Add at the beginning
 public void addAtBeginning(int rollNumber, String name, int age, String grade) {
     StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
     newNode.next = head;
     head = newNode;
 }

 // Add at the end
 public void addAtEnd(int rollNumber, String name, int age, String grade) {
     StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
     if (head == null) {
         head = newNode;
         return;
     }
     StudentNode current = head;
     while (current.next != null) {
         current = current.next;
     }
     current.next = newNode;
 }

 // Add at a specific position (0-based index)
 public void addAtPosition(int index, int rollNumber, String name, int age, String grade) {
     if (index < 0) {
         System.out.println("Invalid position.");
         return;
     }
     if (index == 0) {
         addAtBeginning(rollNumber, name, age, grade);
         return;
     }
     StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
     StudentNode current = head;
     for (int i = 0; current != null && i < index - 1; i++) {
         current = current.next;
     }
     if (current == null) {
         System.out.println("Position out of bounds.");
         return;
     }
     newNode.next = current.next;
     current.next = newNode;
 }

 // Delete by roll number
 public void deleteByRollNumber(int rollNumber) {
     if (head == null) {
         System.out.println("List is empty.");
         return;
     }
     if (head.rollNumber == rollNumber) {
         head = head.next;
         return;
     }
     StudentNode current = head;
     while (current.next != null && current.next.rollNumber != rollNumber) {
         current = current.next;
     }
     if (current.next == null) {
         System.out.println("Roll number not found.");
     } else {
         current.next = current.next.next;
     }
 }

 // Search by roll number
 public StudentNode searchByRollNumber(int rollNumber) {
     StudentNode current = head;
     while (current != null) {
         if (current.rollNumber == rollNumber) {
             return current;
         }
         current = current.next;
     }
     return null;
 }

 // Update grade
 public void updateGrade(int rollNumber, String newGrade) {
     StudentNode student = searchByRollNumber(rollNumber);
     if (student != null) {
         student.grade = newGrade;
         System.out.println("Grade updated.");
     } else {
         System.out.println("Student not found.");
     }
 }

 // Display all students
 public void displayAll() {
     if (head == null) {
         System.out.println("No student records available.");
         return;
     }
     StudentNode current = head;
     while (current != null) {
         System.out.println("Roll: " + current.rollNumber + ", Name: " + current.name +
                 ", Age: " + current.age + ", Grade: " + current.grade);
         current = current.next;
     }
 }

 // Main method for testing
 public static void main(String[] args) {
     StudentListManager manager = new StudentListManager();

     manager.addAtEnd(101, "Alice", 20, "A");
     manager.addAtBeginning(102, "Bob", 19, "B");
     manager.addAtPosition(1, 103, "Charlie", 21, "C");
     manager.displayAll();

     System.out.println("\nUpdating grade for roll 103...");
     manager.updateGrade(103, "A+");

     System.out.println("\nSearching for roll 101...");
     StudentNode student = manager.searchByRollNumber(101);
     if (student != null)
         System.out.println("Found: " + student.name + ", Grade: " + student.grade);

     System.out.println("\nDeleting roll 102...");
     manager.deleteByRollNumber(102);

     System.out.println("\nFinal list:");
     manager.displayAll();
 }
}
