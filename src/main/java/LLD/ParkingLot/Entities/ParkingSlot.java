package LLD.ParkingLot.Entities;

public class ParkingSlot {
    int id;
    VehicleType vehicleType;
    boolean isOccupied;
    public ParkingSlot(int id, VehicleType vehicleType) {
        this.id = id;
        this.vehicleType = vehicleType;
        this.isOccupied = false;
    }

    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

}
