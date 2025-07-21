package SystemDesign.LowLevelDesign.ParkingLot;

public class ParkingSpot {
    int spotId;
    Vehicle vehicle;
    boolean isAvailable=true;
    // int distanceFromElevator;
    // int distanceFromExistGate;
    // int distanceFromEntranceGate;

    public void parkVehicle(Vehicle vehicle,int spotId){
        this.spotId = spotId;
        this.vehicle= vehicle;
        this.isAvailable = false;
        // this.distanceFromElevator=distanceFromElevator;
        // this.distanceFromEntranceGate=distanceFromEntranceGate;
        // this.distanceFromExistGate=distanceFromExistGate;
    }

    public void unparkVehicle(){
        this.isAvailable = true;
        this.spotId = -1;
        this.vehicle = null;
    }
}
