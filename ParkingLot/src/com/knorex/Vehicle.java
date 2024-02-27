package com.knorex;

public class Vehicle {
	
	private String type;
    private String registrationNumber;
    private String color;

    public Vehicle(String type, String registrationNumber, String color) {
        this.type = type;
        this.registrationNumber = registrationNumber;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", registrationNumber=" + registrationNumber + ", color=" + color + "]";
	}
    
	    

}
//1. ParkingLot: Represents the parking lot and manages vehicle spaces.
//2. Vehicle: Represents a vehicle with attributes such as vehicle type, registration number, color, and
//any other necessary attributes.
//3. Floor: Represents a floor in the parking lot with attributes like floor number, capacity for each
//vehicle type, and vehicle spaces.
//4. VehicleSpace: Represents a vehicle space with attributes such as space number, availability,
//vehicle type, and any other necessary attributes.
//5. CostStrategy: Represents the cost strategy for parking, allowing for varying costs based on the
//vehicle type and supporting different currencies.