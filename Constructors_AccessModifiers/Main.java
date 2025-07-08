package OOPS_Constructors_AccessModifiers;

public class Main {
    public static void main(String[] args) {

        System.out.println("========== LEVEL 1 CONSTRUCTOR PROGRAMS ==========\n");

        // Book (default & parameterized)
        System.out.println("----- Book -----");
        Book book1 = new Book("Java Programming", "James Gosling", 499.99);
        Book book2 = new Book();
        book1.displayBook();
        book2.displayBook();

        // Circle (constructor chaining)
        System.out.println("\n----- Circle -----");
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(4.5);
        circle1.display();
        circle2.display();

        // Person (copy constructor)
        System.out.println("\n----- Person -----");
        Person p1 = new Person("Aarti", 25);
        Person p2 = new Person(p1);
        p1.displayPerson();
        p2.displayPerson();

        // Hotel Booking
        System.out.println("\n----- Hotel Booking -----");
        HotelBooking booking1 = new HotelBooking("Karan", "Deluxe", 3);
        HotelBooking booking2 = new HotelBooking(booking1);
        booking1.displayBooking();
        booking2.displayBooking();

        // Library Book
        System.out.println("\n----- Library Book -----");
        LibraryBook lb = new LibraryBook("Atomic Habits", "James Clear", 350.0);
        lb.displayStatus();
        lb.borrowBook();
        lb.borrowBook();  // Trying to borrow again
        lb.displayStatus();

        // Car Rental
        System.out.println("\n----- Car Rental -----");
        CarRental rental = new CarRental("Nisha", "Honda City", 5);
        rental.displayRental();

        System.out.println("\n========== INSTANCE VS CLASS VARIABLES ==========\n");

        // Product
        System.out.println("----- Product Inventory -----");
        Product prod1 = new Product("Pen", 10);
        Product prod2 = new Product("Notebook", 25);
        prod1.displayProductDetails();
        prod2.displayProductDetails();
        Product.displayTotalProducts();

        // Course
        System.out.println("\n----- Course Management -----");
        Course course1 = new Course("Core Java", 6, 2500);
        course1.displayCourseDetails();
        Course.updateInstituteName("OpenAI Academy");
        Course course2 = new Course("Web Dev", 8, 3200);
        course2.displayCourseDetails();

        // Vehicle
        System.out.println("\n----- Vehicle Registration -----");
        Vehicle v1 = new Vehicle("Rahul", "Bike");
        Vehicle v2 = new Vehicle("Sneha", "Car");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(2200);
        v1.displayVehicleDetails(); // after update

        System.out.println("\n========== ACCESS MODIFIERS ==========\n");

        // Student and PostGraduateStudent
        System.out.println("----- University Management -----");
        Student stu = new Student(101, "Manish", 8.9);
        PostGraduateStudent pgStu = new PostGraduateStudent(102, "Riya", 9.1);
        pgStu.displayPostgradInfo();
        System.out.println("Old CGPA: " + stu.getCGPA());
        stu.setCGPA(9.3);
        System.out.println("Updated CGPA: " + stu.getCGPA());

        // Books and EBooks
        System.out.println("\n----- Book Library (Access Modifiers) -----");
        Books bookAccess = new Books("ISBN123", "Clean Code", "Robert C. Martin");
        EBooks ebook = new EBooks("ISBN999", "AI for Beginners", "Andrew Ng");
        ebook.displayEBook();

        // BankAccount and SavingsAccount
        System.out.println("\n----- Bank Account -----");
        BankAccount acc = new BankAccount(1234567890L, "Suresh", 5000);
        SavingsAccount savings = new SavingsAccount(9988776655L, "Meena", 7500);
        savings.displayAccountInfo();
        savings.deposit(1500);
        savings.withdraw(3000);
        savings.displayAccountInfo();

        // Employee and Manager
        System.out.println("\n----- Employee Records -----");
        Employee emp = new Employee(201, "IT", 40000);
        Manager mgr = new Manager(202, "HR", 60000);
        mgr.raiseSalary(5000);
        mgr.displayManagerInfo();
    }
}
