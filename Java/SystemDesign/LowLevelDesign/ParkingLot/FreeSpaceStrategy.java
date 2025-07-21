package SystemDesign.LowLevelDesign.ParkingLot;
import java.util.ArrayList;

public interface FreeSpaceStrategy {
    public ParkingSpot findFreeSpace(ArrayList<ParkingSpot> parkingSpots);
}
