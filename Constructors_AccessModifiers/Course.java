package OOPS_Constructors_AccessModifiers;


public class Course {
    private String courseName;
    private int duration;
    private double fee;

    // Class variable (common to all)
    private static String instituteName = "BridgeLabz Academy";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Fee: ₹" + fee);
        System.out.println("Institute: " + instituteName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
