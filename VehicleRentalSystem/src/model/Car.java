package model;

/**
 * Car is a subclass of Vehicle that represents a car vehicle type
 *
 * @param make, model, year, price for DEFAULT_CAR
 * @return DEFAULT_CAR with set values
 */

public class Car extends Vehicle {

    public Car(String make, String model, int year, double price) {
        super(make, model, year, price);
    }

    public static final Car DEFAULT_CAR = new Car("Toyota", "Camry", 2025, 100);

}