package OOPS_Constructors_AccessModifiers;

public class Manager extends Employee {

    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerInfo() {
        System.out.println("Manager ID: " + employeeID + ", Dept: " + department + ", Salary: ₹" + getSalary());
    }
}
