package LLD.ParkingLot.Entities;


import java.time.LocalDateTime;

public class PrakingTicket {
    int id;
    ParkingSlot slot;
    Vehicle vehicle;
    LocalDateTime startTime;

    public PrakingTicket(int id, ParkingSlot slot, Vehicle vehicle, LocalDateTime startTime) {
        this.id = id;
        this.slot = slot;
        this.vehicle = vehicle;
        this.startTime =startTime;
    }

    public Ticket getTicket() {
        return new Ticket(id, slot.id, vehicle.licenseNumber, vehicle.vehicleType,startTime);
    }

}
