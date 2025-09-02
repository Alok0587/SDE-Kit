package LLD.ParkingLot.Entities;

public abstract  class Vehicle {
    String licenseNumber;
    VehicleType vehicleType;
    public Vehicle( String licenseNumber, VehicleType vehicleType) {
        this.licenseNumber = licenseNumber;
        this.vehicleType = vehicleType;
    }

    public void setLicenseNumber(String licenseNumber) {};
    public void setVehicleType(VehicleType vehicleType) {};

}
