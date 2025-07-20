package SystemDesign.LowLevelDesign.ParkingLot;

public class Ticket {
    String entryTime;
    Vehicle vehicle;
    int spotId;

    public void generateTicket(String entryTime, ParkingSpot spot) {
        this.entryTime = entryTime;
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
