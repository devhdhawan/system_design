package SystemDesign.LowLevelDesign.ParkingLot.ParkingFactory;

import SystemDesign.LowLevelDesign.ParkingLot.ParkingSpotManager;

public interface VehicleFactoryInterface {  
    
    public ParkingSpotManager createVehicle();
}
