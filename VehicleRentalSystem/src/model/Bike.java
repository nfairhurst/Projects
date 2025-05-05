package model;

/**
 * Bike is a subclass of Vehicle that represents a car vehicle type
 *
 * @param make, model, year, price for DEFAULT_BIKE
 * @return DEFAULT_BIKE with set values
 */

public class Bike extends Vehicle {

    public Bike(String make, String model, int year, double price) {
        super(make, model, year, price);
    }

    public static final Bike DEFAULT_BIKE = new Bike("Honda", "Cruise", 2025, 150); 
}
