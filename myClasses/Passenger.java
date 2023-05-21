package myInterfaces;


import java.lang.*;


public class Passenger extends Person {
	private int discountRate;
	private String pickupLocation;
    private String destination;
    private int numberOfPassengers;
    private boolean isSharedRide;
	//Empty Constructor
	public Passenger() {
		//System.out.println("Empty Constructor");
    }

    // Parameterized Constructor
    public Passenger(String name, String id, int phoneNumber,String dateOfBirth, String address, String email, String bloodGroup,int discountRate, String pickupLocation, String destination, int numberOfPassengers, boolean isSharedRide) {
        super(name,id,phoneNumber,dateOfBirth,address,email,bloodGroup);
		this.discountRate = discountRate;
        this.pickupLocation = pickupLocation;
        this.destination = destination;
        this.numberOfPassengers = numberOfPassengers;
        this.isSharedRide = isSharedRide;
    }

    // Setters
    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setSIsharedRide(boolean isSharedRide) {
        this.isSharedRide = isSharedRide;
    }

    // Getters
    public int getDiscountRate() {
        return discountRate;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public boolean getIsSharedRide() {
        return isSharedRide;
    }
	public void show() {
        super.showInfo();
        System.out.println("Discount Rate: " + discountRate);
        System.out.println("Pickup Location: " + pickupLocation);
        System.out.println("Destination: " + destination);
        System.out.println("Number of Passengers: " + numberOfPassengers);
        System.out.println("Shared Ride: " + (isSharedRide ? "Yes" : "No"));
    }
}
