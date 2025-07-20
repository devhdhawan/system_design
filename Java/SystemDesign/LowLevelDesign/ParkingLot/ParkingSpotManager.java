package SystemDesign.LowLevelDesign.ParkingLot;
import java.util.ArrayList;

public class ParkingSpotManager {
    ArrayList<ParkingSpot> parkingSpots;

    public ParkingSpotManager(ArrayList<ParkingSpot> parkingSpots) {
            this.parkingSpots = parkingSpots;
    }

    public ParkingSpot findFreeSpace(){
        ParkingSpot spot = null;
        for(int i=0;i<parkingSpots.size();i++){
            spot = parkingSpots.get(i);
            if(spot.isAvailable){
                return spot;
            }
        }
        spot=null;
        return spot;
    }

    public void parkVehicle(ParkingSpot spot){
        spot.parkVehicle(spot.vehicle,spot.spotId);
        System.out.println("Vehicle with license plate " + spot.vehicle.getLicensePlate() + " has been parked at spot ID " + spot.spotId);
    }

    public void unparkVehicle(ParkingSpot spot){
        spot.unparkVehicle();
        System.out.println("Vehicle with license plate " + spot.vehicle.getLicensePlate() + " has been unparked from spot ID " + spot.spotId);
    }
}
