package SystemDesign.LowLevelDesign.ParkingLot;

public class ParkingSpot {
    int spotId;
    Vehicle vehicle;
    boolean isAvailable=true;
    Ticket ticket;
    int rate=0;
    // int distanceFromElevator;
    // int distanceFromExistGate;
    // int distanceFromEntranceGate;

    public void parkVehicle(Vehicle vehicle,int spotId,int rate){
        this.spotId = spotId;
        this.vehicle= vehicle;
        this.isAvailable = false;
        this.rate=rate;
        // this.distanceFromElevator=distanceFromElevator;
        // this.distanceFromEntranceGate=distanceFromEntranceGate;
        // this.distanceFromExistGate=distanceFromExistGate;
    }

    public void unpark(){
        this.isAvailable=true;
    }

    // public void display(){
    //     System.out.println("Spot ID: " + spotId);
    //     System.out.println("Vehicle License Plate: " + (vehicle != null ? vehicle.getLicensePlate() : "No Vehicle"));
    //     System.out.println("Is Available: " + isAvailable);
    //     System.out.println("Vehicle Type: " + (vehicle != null ? vehicle.getVehicleType() : "No Vehicle"));
    //     // System.out.println("Distance from Elevator: " + distanceFromElevator);
    //     // System.out.println("Distance from Entrance Gate: " + distanceFromEntranceGate);
    //     // System.out.println("Distance from Exit Gate: " + distanceFromExistGate);
    // }
}
