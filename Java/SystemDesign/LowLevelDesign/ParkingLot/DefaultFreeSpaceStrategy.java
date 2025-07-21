package SystemDesign.LowLevelDesign.ParkingLot;
import java.util.ArrayList;

public class DefaultFreeSpaceStrategy implements FreeSpaceStrategy {
    public ParkingSpot findFreeSpace(ArrayList<ParkingSpot> parkingSpots){
       
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
}
