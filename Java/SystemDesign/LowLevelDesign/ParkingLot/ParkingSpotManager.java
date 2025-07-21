package SystemDesign.LowLevelDesign.ParkingLot;
import java.util.ArrayList;

public class ParkingSpotManager {
    ArrayList<ParkingSpot> parkingSpots;

    public ParkingSpotManager(ArrayList<ParkingSpot> parkingSpots) {
            this.parkingSpots = parkingSpots;
    }

    public ParkingSpot findFreeSpace(int choice){
        ParkingSpot Spot=null;
        if(choice==1){
            DefaultFreeSpaceStrategy defaultStrategy=new DefaultFreeSpaceStrategy();
            
            Spot=defaultStrategy.findFreeSpace(parkingSpots);
      
        }else{
            System.out.println("Invalid Strategy");
        }
        return Spot;
        
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
