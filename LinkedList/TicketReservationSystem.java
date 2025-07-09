package DSA_LinkedList;

//Node class representing each ticket
class TicketNode {
 int ticketId;
 String customerName;
 String movieName;
 String seatNumber;
 String bookingTime;
 TicketNode next;

 public TicketNode(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
     this.ticketId = ticketId;
     this.customerName = customerName;
     this.movieName = movieName;
     this.seatNumber = seatNumber;
     this.bookingTime = bookingTime;
 }
}

//Manager class for the circular linked list
public class TicketReservationSystem {
 private TicketNode head = null;

 // Add new ticket at the end
 public void addTicket(int id, String customer, String movie, String seat, String time) {
     TicketNode newTicket = new TicketNode(id, customer, movie, seat, time);

     if (head == null) {
         head = newTicket;
         head.next = head; // circular
     } else {
         TicketNode current = head;
         while (current.next != head) {
             current = current.next;
         }
         current.next = newTicket;
         newTicket.next = head;
     }

     System.out.println("Ticket booked successfully for " + customer + " (" + movie + ")");
 }

 // Remove ticket by ticket ID
 public void removeTicket(int ticketId) {
     if (head == null) {
         System.out.println("No tickets found.");
         return;
     }

     TicketNode current = head;
     TicketNode prev = null;

     do {
         if (current.ticketId == ticketId) {
             if (current == head) {
                 // Only one node
                 if (head.next == head) {
                     head = null;
                 } else {
                     // Find last node to fix circular link
                     TicketNode temp = head;
                     while (temp.next != head) {
                         temp = temp.next;
                     }
                     head = head.next;
                     temp.next = head;
                 }
             } else {
                 prev.next = current.next;
             }

             System.out.println("Ticket ID " + ticketId + " removed.");
             return;
         }

         prev = current;
         current = current.next;
     } while (current != head);

     System.out.println("Ticket ID not found.");
 }

 // Display all tickets
 public void displayAllTickets() {
     if (head == null) {
         System.out.println("No tickets booked.");
         return;
     }

     System.out.println("Current Bookings:");
     TicketNode current = head;
     do {
         System.out.println("ID: " + current.ticketId + ", Name: " + current.customerName +
                 ", Movie: " + current.movieName + ", Seat: " + current.seatNumber +
                 ", Time: " + current.bookingTime);
         current = current.next;
     } while (current != head);
 }

 // Search ticket by Customer Name or Movie Name
 public void searchTicket(String keyword) {
     if (head == null) {
         System.out.println("No tickets to search.");
         return;
     }

     TicketNode current = head;
     boolean found = false;

     do {
         if (current.customerName.equalsIgnoreCase(keyword) || current.movieName.equalsIgnoreCase(keyword)) {
             System.out.println("Found: ID " + current.ticketId + " | " + current.customerName +
                     " | " + current.movieName + " | Seat " + current.seatNumber +
                     " | Time: " + current.bookingTime);
             found = true;
         }
         current = current.next;
     } while (current != head);

     if (!found) {
         System.out.println("No matching tickets found.");
     }
 }

 // Count total tickets
 public int countTickets() {
     if (head == null) return 0;

     int count = 0;
     TicketNode current = head;

     do {
         count++;
         current = current.next;
     } while (current != head);

     return count;
 }

 // Main method for testing
 public static void main(String[] args) {
     TicketReservationSystem system = new TicketReservationSystem();

     system.addTicket(1, "Nitya", "Oppenheimer", "A10", "12:30 PM");
     system.addTicket(2, "Aman", "Barbie", "B5", "2:00 PM");
     system.addTicket(3, "Sara", "Oppenheimer", "C1", "4:00 PM");

     System.out.println();
     system.displayAllTickets();

     System.out.println("\nSearching for movie 'Oppenheimer':");
     system.searchTicket("Oppenheimer");

     System.out.println("\nTotal Tickets Booked: " + system.countTickets());

     System.out.println("\nRemoving Ticket ID 2:");
     system.removeTicket(2);
     system.displayAllTickets();

     System.out.println("\nTotal Tickets Booked: " + system.countTickets());
 }
}
