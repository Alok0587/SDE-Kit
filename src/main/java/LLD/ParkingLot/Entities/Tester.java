package LLD.ParkingLot.Entities;

import java.util.ArrayList;
import java.util.List;

public class Tester {

    public static void main(String[] args) {
        List<ParkingLot> parkingLots = new ArrayList<>();

        List<ParkingLevel> parkingLevels = new ArrayList<>();

        List<ParkingSlot> parkingSlots = new ArrayList<>();
        parkingSlots.add(new ParkingSlot(1, VehicleType.CAR));
        parkingSlots.add(new ParkingSlot(2, VehicleType.BIKE));
        parkingSlots.add(new ParkingSlot(3, VehicleType.TRUCK));

        parkingLevels.add(new ParkingLevel(1, parkingSlots));
        parkingLevels.add(new ParkingLevel(2, parkingSlots));

        parkingLots.add(new ParkingLot(1, parkingLevels));


        // Test case: Find available slot for a CAR
        ParkingLot parkingLot = parkingLots.get(0);
        ParkingSlot availableSlot = parkingLot.getAvailableSlot(VehicleType.CAR);

        if (availableSlot != null) {
            System.out.println("Available slot found for CAR: Slot ID " + availableSlot.id);
        } else {
            System.out.println("No available slot found for CAR");
        }

        // Test case: Park a vehicle
        Vehicle vehicle = new Car("ABC123");
        Vehicle vehicle2 = new Bus("XYZ789");

        parkingLot.parkVehicle(vehicle, availableSlot);
        System.out.println("Vehicle parked: " + vehicle.licenseNumber + " in Slot ID " + availableSlot.id);
        ParkingSlot parkingSlot1 = parkingLot.getAvailableSlot(VehicleType.TRUCK);
        parkingLot.parkVehicle(vehicle2, parkingSlot1);

        // Test case: Unpark a vehicle
        Ticket tkt=parkingLot.unParkVehicle(availableSlot);

        System.out.println("Vehicle unparked from Slot ID " + availableSlot.id+"\n Ticket Details: "+tkt);

        Ticket tkt2=parkingLot.unParkVehicle(parkingSlot1);
        System.out.println("Vehicle unparked from Slot ID " + availableSlot.id+"\n Ticket Details: "+tkt2);


    }
}
