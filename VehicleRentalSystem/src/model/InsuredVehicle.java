package model;

/**
 * InsuredVehicle is a class that implements the Insurable interface and returns the insured cost of a vehicle
 *
 * @param vehicle the vehicle to be insured
 * @param INSURANCE_RATE the insurance rate applied to the vehicle, I set it to 15%
 * @return insured cost
 */

public class InsuredVehicle implements Insurable {
    private Vehicle vehicle;
    private static final double INSURANCE_RATE = 0.15;

    public InsuredVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public double calculateInsuredCost(int days) { 
        double baseCost = vehicle.getPrice() * days;
        return baseCost * (1 + INSURANCE_RATE);
    }
}