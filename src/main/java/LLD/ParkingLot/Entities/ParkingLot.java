package LLD.ParkingLot.Entities;

import java.util.List;

public class ParkingLot {
    private int id;
    List<ParkingLevel> levels;

    public ParkingLot(int id, List<ParkingLevel> levels) {
        this.id = id;
        this.levels = levels;
    }

    public ParkingSlot getAvailableSlot(VehicleType vehicleType) {
        for(ParkingLevel level : levels) {
            ParkingSlot slot = level.getAvailableSlot(vehicleType);
            if(slot != null) {
                return slot;
            }
        }

        return null;
    }

    public void parkVehicle(Vehicle vehicle,ParkingSlot slot) {

        if(slot != null) {
            slot.setIsOccupied(true);
        }
        slot.vehicleType=vehicle.vehicleType;
        slot.setPlateNumber(vehicle.licenseNumber);
    }

    public Ticket unParkVehicle(ParkingSlot slot) {
        Ticket ticket = new Ticket(1, slot.id, slot.plateNumber, slot.vehicleType,slot.startTime);
        if(slot != null) {
            slot.setIsOccupied(false);
            slot.setPlateNumber(null);
            slot.vehicleType=null;
        }
        return ticket;
    }

}
