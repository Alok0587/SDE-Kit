package LLD.ParkingLot.Entities;

import java.util.List;

public class ParkingLevel {
    private int id;
    List<ParkingSlot> slots;

    public ParkingLevel(int id, List<ParkingSlot> slots) {
        this.id = id;
        this.slots = slots;
    }

    public ParkingSlot getAvailableSlot(VehicleType vehicleType) {
        for(ParkingSlot slot : slots) {
            if(slot.vehicleType == vehicleType && !slot.isOccupied) {
                return slot;
            }
        }
        return null;
    }

}
