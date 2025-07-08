package OOPS_Keywords_Instances;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Bank Account Test ===");
        BankAccount acc1 = new BankAccount("Amit Sharma", "SBI123456", 15000.0);
        BankAccount acc2 = new BankAccount("Neha Gupta", "SBI789012", 25000.0);
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        BankAccount.getTotalAccounts();

        System.out.println("\n=== Library Book Test ===");
        Book book1 = new Book("The Alchemist", "Paulo Coelho", "ISBN001");
        Book book2 = new Book("Java Programming", "Herbert Schildt", "ISBN002");
        book1.displayBookDetails();
        book2.displayBookDetails();
        Book.displayLibraryName();

        System.out.println("\n=== Employee Test ===");
        Employee emp1 = new Employee("Rajeev Kumar", 101, "Software Engineer");
        Employee emp2 = new Employee("Priya Singh", 102, "QA Analyst");
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        Employee.displayTotalEmployees();

        System.out.println("\n=== Product Test ===");
        Product prod1 = new Product("Laptop", 55000.0, 2, "PROD1001");
        Product prod2 = new Product("Smartphone", 25000.0, 3, "PROD1002");
        prod1.displayProductDetails();
        prod2.displayProductDetails();
        Product.updateDiscount(15.0); // static method usage
        System.out.println("-- After Updating Discount --");
        prod1.displayProductDetails();

        System.out.println("\n=== Student Test ===");
        Student stu1 = new Student("Manish Verma", 201, 'A');
        Student stu2 = new Student("Ayesha Khan", 202, 'B');
        stu1.displayStudentDetails();
        stu2.displayStudentDetails();
        Student.displayTotalStudents();

        System.out.println("\n=== Vehicle Test ===");
        Vehicle veh1 = new Vehicle("Ravi Mehra", "Car", "MH12AB1234");
        Vehicle veh2 = new Vehicle("Sita Joshi", "Bike", "DL45XY6789");
        veh1.displayVehicleDetails();
        veh2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(1800.0);
        System.out.println("-- After Fee Update --");
        veh1.displayVehicleDetails();

        System.out.println("\n=== Patient Test ===");
        Patient pat1 = new Patient("Sunita Rani", 45, "Flu", 301);
        Patient pat2 = new Patient("Alok Nath", 60, "Diabetes", 302);
        pat1.displayPatientDetails();
        pat2.displayPatientDetails();
        Patient.getTotalPatients();
    }
}
