package OOPS_Constructors_AccessModifiers;

public class PostGraduateStudent extends Student {

    public PostGraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayPostgradInfo() {
        System.out.println("PG Student Roll: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA());
    }
}
