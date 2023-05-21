package myClasses;

import java.lang.*;

public class Person {

	private String name, id, address, bloodGroup, email, dateOfBirth;
	private int phoneNumber;

	// person class empty constructor
	public Person() {
		// System.out.println("Empty Person ");
	}

	// person class parameterized constructor
	public Person(String name, String id, int phoneNumber, String dateOfBirth, String address, String email,
			String bloodGroup) {
		System.out.println("Parameterized Customer");
		this.name = name;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.bloodGroup = bloodGroup;
	}

	// setting name
	public void setName(String name) {
		this.name = name;
	}

	// setting id
	public void setId(String id) {
		this.id = id;
	}

	// setting address
	public void setAddress(String address) {
		this.address = address;
	}

	// setting email
	public void setEmail(String email) {
		this.email = email;
	}

	// setting phone number
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// setting date of birth
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	// setting blood group
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	// getting name
	public String getName() {
		return name;
	}

	// getting id
	public String getId() {
		return id;
	}

	// getting phone number
	public int getPhoneNumber() {
		return phoneNumber;
	}

	// getting date of birth
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	// getting address
	public String getAddress() {
		return address;
	}

	// getting email
	public String getEmail() {
		return email;
	}

	// getting blood group
	public String getBloodGroup() {
		return bloodGroup;
	}

	public void showInfo() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Address: " + address);
		System.out.println("E-mail: " + email);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Blood Group: " + bloodGroup);
	}
}