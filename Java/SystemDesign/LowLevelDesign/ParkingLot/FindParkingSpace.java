package SystemDesign.LowLevelDesign.ParkingLot;

public class FindParkingSpace {
    private FreeSpaceStrategy strategy;

    public FindParkingSpace(FreeSpaceStrategy strategy){
        this.strategy=strategy;
    }

    public ParkingSpot optimalSpaceFinder(ArrayList<ParkingSpot> list){
        return this.strategy.findFreeSpace(list);
    }
}
