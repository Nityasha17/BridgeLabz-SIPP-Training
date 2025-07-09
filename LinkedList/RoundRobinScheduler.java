package DSA_LinkedList;

//Node class for Process
class ProcessNode {
 int processId;
 int burstTime;
 int remainingTime;
 int priority;
 ProcessNode next;

 public ProcessNode(int processId, int burstTime, int priority) {
     this.processId = processId;
     this.burstTime = burstTime;
     this.remainingTime = burstTime;
     this.priority = priority;
 }
}

//Scheduler class for Circular Linked List
public class RoundRobinScheduler {
 private ProcessNode head = null;
 private int timeQuantum;

 public RoundRobinScheduler(int timeQuantum) {
     this.timeQuantum = timeQuantum;
 }

 // Add process at end
 public void addProcess(int processId, int burstTime, int priority) {
     ProcessNode newNode = new ProcessNode(processId, burstTime, priority);
     if (head == null) {
         newNode.next = newNode;
         head = newNode;
         return;
     }
     ProcessNode temp = head;
     while (temp.next != head) {
         temp = temp.next;
     }
     temp.next = newNode;
     newNode.next = head;
 }

 // Remove process by ID
 public void removeProcess(int processId) {
     if (head == null) return;

     // Single node case
     if (head.processId == processId && head.next == head) {
         head = null;
         return;
     }

     ProcessNode current = head, prev = null;

     do {
         if (current.processId == processId) {
             if (current == head) {
                 ProcessNode temp = head;
                 while (temp.next != head) {
                     temp = temp.next;
                 }
                 head = head.next;
                 temp.next = head;
             } else {
                 prev.next = current.next;
             }
             return;
         }
         prev = current;
         current = current.next;
     } while (current != head);
 }

 // Simulate round robin scheduling
 public void simulate() {
     if (head == null) {
         System.out.println("No processes to schedule.");
         return;
     }

     int totalTime = 0;
     int completed = 0;
     int processCount = getProcessCount();
     int[] waitingTime = new int[processCount];
     int[] turnaroundTime = new int[processCount];

     ProcessNode current = head;
     while (completed < processCount) {
         if (current.remainingTime > 0) {
             int execTime = Math.min(timeQuantum, current.remainingTime);
             totalTime += execTime;
             current.remainingTime -= execTime;

             System.out.println("Process " + current.processId + " executed for " + execTime + " units");

             if (current.remainingTime == 0) {
                 turnaroundTime[current.processId - 1] = totalTime;
                 waitingTime[current.processId - 1] = turnaroundTime[current.processId - 1] - current.burstTime;
                 completed++;
                 System.out.println("Process " + current.processId + " completed.");
             }
         }
         current = current.next;
     }

     double avgWT = 0, avgTAT = 0;
     System.out.println("\nFinal Times:");
     for (int i = 0; i < processCount; i++) {
         System.out.println("Process " + (i + 1) + " - Waiting Time: " + waitingTime[i] + ", Turnaround Time: " + turnaroundTime[i]);
         avgWT += waitingTime[i];
         avgTAT += turnaroundTime[i];
     }

     System.out.printf("Average Waiting Time: %.2f\n", avgWT / processCount);
     System.out.printf("Average Turnaround Time: %.2f\n", avgTAT / processCount);
 }

 // Display process queue
 public void displayProcesses() {
     if (head == null) {
         System.out.println("No processes scheduled.");
         return;
     }
     ProcessNode temp = head;
     System.out.println("Process Queue:");
     do {
         System.out.println("ID: " + temp.processId + ", Burst: " + temp.burstTime + ", Priority: " + temp.priority);
         temp = temp.next;
     } while (temp != head);
 }

 // Count total number of processes
 public int getProcessCount() {
     if (head == null) return 0;
     int count = 0;
     ProcessNode temp = head;
     do {
         count++;
         temp = temp.next;
     } while (temp != head);
     return count;
 }

 // Main method for testing
 public static void main(String[] args) {
     RoundRobinScheduler scheduler = new RoundRobinScheduler(3);

     scheduler.addProcess(1, 7, 2);
     scheduler.addProcess(2, 4, 1);
     scheduler.addProcess(3, 9, 3);
     scheduler.addProcess(4, 5, 2);

     scheduler.displayProcesses();
     System.out.println("\nSimulating Round Robin:");
     scheduler.simulate();
 }
}
