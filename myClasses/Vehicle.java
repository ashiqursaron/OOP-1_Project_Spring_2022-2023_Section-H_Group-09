package myInterfaces;
import java.lang.*;


public class Vehicle{
	
	private String vehicleName,vehicleType,vehicleLicenseNumber,color;
	private int numberOfWheels;
	    // Empty constructor
    public Vehicle() {
        // System.out.println("Empty Constructor");
        
    }

    // Parameterized constructor
    public Vehicle(String vehicleName, String vehicleType, String vehicleLicenseNumber, String color, int numberOfWheels) {
        this.vehicleName = vehicleName;
        this.vehicleType = vehicleType;
        this.vehicleLicenseNumber = vehicleLicenseNumber;
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }
	// Setter methods
    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setVehicleLicenseNumber(String vehicleLicenseNumber) {
        this.vehicleLicenseNumber = vehicleLicenseNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    // Getter methods
    public String getVehicleName() {
        return vehicleName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getVehicleLicenseNumber() {
        return vehicleLicenseNumber;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    
	 public void show() {
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("License Number: " + vehicleLicenseNumber);
        System.out.println("Color: " + color);
        System.out.println("Number of Wheels: " + numberOfWheels);
    }
}
