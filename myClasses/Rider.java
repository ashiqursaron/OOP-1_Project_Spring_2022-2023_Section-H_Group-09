package myInterfaces;
import java.lang.*;


public class Rider extends Person{
	
	
	private String riderLicenseNumber;
	private int numberOfTrips,rating;
	public Rider() {
        // Empty constructor
    }
    
    // Parameterized constructor
    public Rider(String name, String id, int phoneNumber,String dateOfBirth, String address, String email, String bloodGroup,String riderLicenseNumber,int numberOfTrips,int rating) {
        // Call to superclass constructor
		super(name,id,phoneNumber,dateOfBirth,address,email,bloodGroup);
        this.riderLicenseNumber = riderLicenseNumber;
        this.numberOfTrips = numberOfTrips;
		this.rating=rating;
       
    }
	// Setters
    public void setRiderLicenseNumber(String riderLicenseNumber) {
        this.riderLicenseNumber = riderLicenseNumber;
    }
    
    public void setNumberOfTrips(int numberOfTrips) {
        this.numberOfTrips = numberOfTrips;
    }
	public void setRating(int rating) {
        this.rating = rating;
    }
	// Getters
    public String getRiderLicenseNumber() {
        return riderLicenseNumber;
    }
    
    public int getNumberOfTrips() {
        return numberOfTrips;
    }
	public int getRating() {
        return rating;
    }
    
    public void show() {
        super.showInfo();
        System.out.println("Rider License Number: " + riderLicenseNumber);
        System.out.println("Number of Trips: " + numberOfTrips);
		System.out.println("Rating: " + rating);
        
    }
}