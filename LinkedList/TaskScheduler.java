package DSA_LinkedList;

//Node class for Task
class TaskNode {
 int taskId;
 String taskName;
 int priority;
 String dueDate;
 TaskNode next;

 public TaskNode(int taskId, String taskName, int priority, String dueDate) {
     this.taskId = taskId;
     this.taskName = taskName;
     this.priority = priority;
     this.dueDate = dueDate;
     this.next = null;
 }
}

//Manager class for Circular Linked List
public class TaskScheduler {
 private TaskNode head = null;

 // Add task at beginning
 public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
     TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
     if (head == null) {
         newNode.next = newNode;
         head = newNode;
         return;
     }

     TaskNode temp = head;
     while (temp.next != head) {
         temp = temp.next;
     }

     newNode.next = head;
     temp.next = newNode;
     head = newNode;
 }

 // Add task at end
 public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
     TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
     if (head == null) {
         newNode.next = newNode;
         head = newNode;
         return;
     }

     TaskNode temp = head;
     while (temp.next != head) {
         temp = temp.next;
     }

     temp.next = newNode;
     newNode.next = head;
 }

 // Add task at a specific position (0-based index)
 public void addAtPosition(int index, int taskId, String taskName, int priority, String dueDate) {
     if (index <= 0) {
         addAtBeginning(taskId, taskName, priority, dueDate);
         return;
     }

     TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
     TaskNode current = head;

     for (int i = 0; i < index - 1 && current.next != head; i++) {
         current = current.next;
     }

     newNode.next = current.next;
     current.next = newNode;
 }

 // Remove a task by Task ID
 public void removeByTaskId(int taskId) {
     if (head == null) {
         System.out.println("List is empty.");
         return;
     }

     TaskNode current = head, prev = null;

     // Special case: head is to be deleted
     if (head.taskId == taskId) {
         if (head.next == head) {
             head = null;
             return;
         }
         TaskNode temp = head;
         while (temp.next != head) {
             temp = temp.next;
         }
         temp.next = head.next;
         head = head.next;
         return;
     }

     do {
         prev = current;
         current = current.next;

         if (current.taskId == taskId) {
             prev.next = current.next;
             return;
         }

     } while (current != head);

     System.out.println("Task ID not found.");
 }

 // View current task (head)
 public void viewCurrentTask() {
     if (head == null) {
         System.out.println("No tasks scheduled.");
     } else {
         System.out.println("Current Task: " + head.taskId + " - " + head.taskName);
     }
 }

 // Move to next task (rotate the head)
 public void moveToNextTask() {
     if (head != null) {
         head = head.next;
     }
 }

 // Display all tasks
 public void displayAllTasks() {
     if (head == null) {
         System.out.println("No tasks in the list.");
         return;
     }

     TaskNode temp = head;
     do {
         System.out.println("ID: " + temp.taskId + ", Name: " + temp.taskName +
                 ", Priority: " + temp.priority + ", Due: " + temp.dueDate);
         temp = temp.next;
     } while (temp != head);
 }

 // Search by Priority
 public void searchByPriority(int priority) {
     if (head == null) {
         System.out.println("No tasks to search.");
         return;
     }

     TaskNode temp = head;
     boolean found = false;
     do {
         if (temp.priority == priority) {
             System.out.println("ID: " + temp.taskId + ", Name: " + temp.taskName + ", Due: " + temp.dueDate);
             found = true;
         }
         temp = temp.next;
     } while (temp != head);

     if (!found) {
         System.out.println("No task found with priority: " + priority);
     }
 }

 // Main method for testing
 public static void main(String[] args) {
     TaskScheduler scheduler = new TaskScheduler();

     scheduler.addAtEnd(1, "Email Client", 2, "2025-07-10");
     scheduler.addAtBeginning(2, "Code Review", 1, "2025-07-09");
     scheduler.addAtPosition(1, 3, "Team Meeting", 3, "2025-07-11");

     System.out.println("All Tasks:");
     scheduler.displayAllTasks();

     System.out.println("\nCurrent Task:");
     scheduler.viewCurrentTask();

     System.out.println("\nNext Task:");
     scheduler.moveToNextTask();
     scheduler.viewCurrentTask();

     System.out.println("\nSearching for Priority 2:");
     scheduler.searchByPriority(2);

     System.out.println("\nDeleting Task ID 3:");
     scheduler.removeByTaskId(3);

     System.out.println("\nFinal Task List:");
     scheduler.displayAllTasks();
 }
}

