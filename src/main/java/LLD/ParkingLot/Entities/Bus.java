package LLD.ParkingLot.Entities;

public class Bus extends Vehicle {
    public Bus(String licenseNumber) {
        super(licenseNumber, VehicleType.TRUCK);
    }
}
