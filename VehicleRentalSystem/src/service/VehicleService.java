package service;
import model.Bike;
import model.Car;
import model.Truck;
import model.Vehicle;

/**
 * VehicleService returns the vehicle object based on what was selected
 *
 * @param vehicleType is either Car, Bike, or Truck
 * @return Vehicle selected
 */

public class VehicleService {

    public Vehicle getVehicleByType(String vehicleType) {
        switch (vehicleType) {
            case "Car":
                return Car.DEFAULT_CAR;
            case "Bike":
                return Bike.DEFAULT_BIKE;
            case "Truck":
                return Truck.DEFAULT_TRUCK;
            default:
                throw new IllegalArgumentException("Invalid vehicle type: " + vehicleType);
        }
    }
}