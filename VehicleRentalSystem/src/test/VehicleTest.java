package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import model.*;

 /**
 * Test for Vehicle and InsuredVehicle classes
 *
 */

public class VehicleTest {

    @Test
    public void testCarBaseCost() {
        Car car = Car.DEFAULT_CAR;
        double marginError = car.getPrice() * 1;
        assertEquals(100.0, marginError, 0.01); // 100 is the base price of the default car and 0.01 is the margin of error
    }

    @Test
    public void testInsuredCarCost() {
        Car car = Car.DEFAULT_CAR;
        InsuredVehicle insuredCar = new InsuredVehicle(car);
        double marginError = insuredCar.calculateInsuredCost(1);
        assertEquals(115.0, marginError, 0.01); // 115 is the expected cost after insurance for the default car and 0.01 is the margin of error
    }

    @Test
    public void testBikeBaseCost() {
        Bike bike = Bike.DEFAULT_BIKE;
        double marginError = bike.getPrice() * 1;
        assertEquals(150.0, marginError, 0.01); // 150 is the base price of the default bike and 0.01 is the margin of error
    }

    @Test
    public void testInsuredBikeCost() {
        Bike bike = Bike.DEFAULT_BIKE;
        InsuredVehicle insuredBike = new InsuredVehicle(bike);
        double marginError = insuredBike.calculateInsuredCost(1);
        assertEquals(172.5, marginError, 0.01); // 172.5 is the expected cost after insurance for the default bike and 0.01 is the margin of error
    }
    @Test
    public void testTruckBaseCost() {
        Truck truck = Truck.DEFAULT_TRUCK;
        double marginError = truck.getPrice() * 1;
        assertEquals(200.0, marginError, 0.01); // 200 is the base price of the default truck and 0.01 is the margin of error
    }

    @Test
    public void testInsuredTruckCost() {
        Truck truck = Truck.DEFAULT_TRUCK;
        InsuredVehicle insuredTruck = new InsuredVehicle(truck);
        double marginError = insuredTruck.calculateInsuredCost(1);
        assertEquals(230.0, marginError, 0.01);  // 230 is the expected cost after insurance for the default truck and 0.01 is the margin of error
    }
}