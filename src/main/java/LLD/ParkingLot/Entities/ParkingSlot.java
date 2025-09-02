package LLD.ParkingLot.Entities;

import java.time.LocalDateTime;

public class ParkingSlot {
    public int id;
    VehicleType vehicleType;
    boolean isOccupied;
    String plateNumber;
    LocalDateTime startTime;
    public ParkingSlot(int id, VehicleType vehicleType) {
        this.id = id;
        this.vehicleType = vehicleType;
        this.isOccupied = false;
    }

    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
        this.startTime = LocalDateTime.now();
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

}
