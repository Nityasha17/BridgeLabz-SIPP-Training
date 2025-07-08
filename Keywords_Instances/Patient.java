package OOPS_Keywords_Instances;

public class Patient {
    private String name;
    private int age;
    private String ailment;
    private final int patientID; // final

    private static String hospitalName = "Sunrise Hospital"; // static
    private static int totalPatients = 0;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name; // this
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) { // instanceof
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }
}
