package model;

/**
 * Truck is a subclass of Vehicle that represents a truck vehicle type
 *
 * @param make, model, year, price for DEFAULT_TRUCK
 * @return DEFAULT_TRUCK with set values
 */

public class Truck extends Vehicle {

    public Truck(String make, String model, int year, double price) {
        super(make, model, year, price);
    }

    public static final Truck DEFAULT_TRUCK = new Truck("Ford", "F-150", 2025, 200);
}