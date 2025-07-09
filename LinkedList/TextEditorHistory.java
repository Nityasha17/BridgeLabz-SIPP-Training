package DSA_LinkedList;


//Node representing a state of the text
class TextStateNode {
 String content;
 TextStateNode prev;
 TextStateNode next;

 public TextStateNode(String content) {
     this.content = content;
 }
}

//Text Editor History using Doubly Linked List
public class TextEditorHistory {
 private TextStateNode head;
 private TextStateNode current;
 private int size = 0;
 private final int MAX_HISTORY = 10;

 // Add new state (after typing or action)
 public void addState(String newText) {
     TextStateNode newState = new TextStateNode(newText);

     // If current is not at the tail, remove all redo states
     if (current != null && current.next != null) {
         current.next.prev = null;
         current.next = null;
     }

     if (head == null) {
         head = newState;
         current = newState;
     } else {
         current.next = newState;
         newState.prev = current;
         current = newState;
     }

     // Enforce max history size
     size++;
     if (size > MAX_HISTORY) {
         head = head.next;
         if (head != null) head.prev = null;
         size--;
     }
 }

 // Undo operation
 public void undo() {
     if (current != null && current.prev != null) {
         current = current.prev;
         System.out.println("Undo: " + current.content);
     } else {
         System.out.println("Nothing to undo.");
     }
 }

 // Redo operation
 public void redo() {
     if (current != null && current.next != null) {
         current = current.next;
         System.out.println("Redo: " + current.content);
     } else {
         System.out.println("Nothing to redo.");
     }
 }

 // Display current text
 public void displayCurrentState() {
     if (current != null) {
         System.out.println("Current State: " + current.content);
     } else {
         System.out.println("Editor is empty.");
     }
 }

 // Display full history (for debug/testing)
 public void displayFullHistory() {
     TextStateNode temp = head;
     System.out.println("History:");
     while (temp != null) {
         System.out.println("- " + temp.content + (temp == current ? " ← Current" : ""));
         temp = temp.next;
     }
 }

 // Main method for testing
 public static void main(String[] args) {
     TextEditorHistory editor = new TextEditorHistory();

     editor.addState("Hello");
     editor.addState("Hello World");
     editor.addState("Hello World!");
     editor.displayCurrentState();

     editor.undo();
     editor.undo();
     editor.redo();

     editor.addState("New sentence.");
     editor.displayCurrentState();

     System.out.println("\nFinal History:");
     editor.displayFullHistory();
 }
}
