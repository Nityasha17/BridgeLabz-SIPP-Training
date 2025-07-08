package OOPS_Constructors_AccessModifiers;

public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void raiseSalary(double increment) {
        salary += increment;
    }

    public double getSalary() {
        return salary;
    }
}
