package SystemDesign.LowLevelDesign.ParkingLot;

import java.time.LocalDateTime;
import java.util.Random;

public class Ticket {
    public LocalDateTime entryTime;
    public Vehicle vehicle;
    public int spotId;

    public void generateTicket(String entryTime, ParkingSpot spot) {
        Random random=new Random();
        int randomInt=random.nextInt(10)+1;
        this.entryTime = LocalDateTime.now().minusHours(randomInt);
        this.vehicle = spot.vehicle;
        this.spotId = spot.spotId;
        this.displayTicket();
    }

    public void displayTicket() {
        System.out.println("Ticket Details:");
        System.out.println("Entry Time: " + entryTime);
        System.out.println("Spot ID: " + spotId);
        System.out.println("Vehicle License Plate: " + vehicle.getLicensePlate());
        System.out.println("Vehicle Type: " + vehicle.getVehicleType());
    }
}
