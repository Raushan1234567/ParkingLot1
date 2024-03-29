package com.knorex;

public interface ParkingInterface {

	    void init(int totalFloors, int capacityPerVehicleType);

	    boolean addVehicle(String vehicleType, String registrationNumber, String color);

	    Vehicle removeVehicle(String registrationNumber);

	    boolean checkAvailability(int floorNumber, String vehicleType);
	
}
