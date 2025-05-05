package model;

/**
 * Vehicle is an abstract class that is the parent class for Car, Bike, and Truck classes.
 *
 * @param make the make of the vehicle
 * @param model the model of the vehicle
 * @param year the year of the vehicle
 * @param price the price of the vehicle
 * @return make, model, year, and price of the vehicle
 */

public abstract class Vehicle { 

    private String make;
    private String model;
    private int year;
    private double price;

    public Vehicle(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }
    

}




