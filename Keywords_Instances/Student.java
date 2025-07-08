package OOPS_Keywords_Instances;

public class Student {
    private String name;
    private final int rollNumber; // final
    private char grade;

    private static String universityName = "XYZ University"; // static
    private static int totalStudents = 0;

    public Student(String name, int rollNumber, char grade) {
        this.name = name; // this
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public void displayStudentDetails() {
        if (this instanceof Student) { // instanceof
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
}
