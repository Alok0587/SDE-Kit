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

}
