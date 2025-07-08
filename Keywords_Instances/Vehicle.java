package OOPS_Keywords_Instances;


public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber; // final

    private static double registrationFee = 1500.0; // static

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName; // this
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) { // instanceof
            System.out.println("Owner: " + ownerName);
            System.out.println("Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: ₹" + registrationFee);
        }
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
