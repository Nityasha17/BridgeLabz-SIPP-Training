package OOPS_Keywords_Instances;

public class Employee {
    private String name;
    private final int id; // final
    private String designation;

    private static String companyName = "BridgeLabz Pvt Ltd"; // static
    private static int totalEmployees = 0;

    public Employee(String name, int id, String designation) {
        this.name = name; // this
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) { // instanceof
            System.out.println("Company: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}
