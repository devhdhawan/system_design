package SystemDesign.LowLevelDesign.ParkingLot;

public class ParkingSpot {
    int spotId;
    Vehicle vehicle;
    boolean isAvailable=true;

    public void parkVehicle(Vehicle vehicle,int spotId){
        this.spotId = spotId;
        this.vehicle= vehicle;
        this.isAvailable = false;
    }

    public void unparkVehicle(){
        this.isAvailable = true;
        this.spotId = -1;
        this.vehicle = null;
    }
}
