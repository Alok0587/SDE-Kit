package LLD.ParkingLot.Entities;

import lombok.ToString;

import java.time.LocalDateTime;

public class Ticket {
    int ticketId;
    int slotId;
    String licenseNumber;
    VehicleType vehicleType;
    LocalDateTime startTime;
    int price;

    public Ticket(int ticketId, int slotId, String licenseNumber, VehicleType vehicleType, LocalDateTime startTime) {
        this.ticketId = ticketId;
        this.slotId = slotId;
        this.licenseNumber = licenseNumber;
        this.vehicleType = vehicleType;
        this.startTime = startTime;
        this.price = calculatePrice(vehicleType,startTime);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", slotId=" + slotId +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", vehicleType=" + vehicleType +
                ", startTime=" + startTime +
                ", price=" + price +
                '}';
    }

    public int calculatePrice(VehicleType vehicleType, LocalDateTime startTime) {
        // Implement your pricing logic here based on vehicle type and duration
        // For simplicity, let's assume a flat rate for each vehicle type
        int basePrice;
        LocalDateTime currentTime = LocalDateTime.now();
        switch (vehicleType) {
            case CAR:
                basePrice = 20; // Flat rate for cars
                break;
            case BIKE:
                basePrice = 10; // Flat rate for bikes
                break;
            case TRUCK:
                basePrice = 30; // Flat rate for trucks
                break;
            default:
                basePrice = 0; // Unknown vehicle type
        }
        // Here you can add logic to calculate price based on duration if needed
        return basePrice*((currentTime.getHour() - startTime.getHour()) + 1);
    }


}
