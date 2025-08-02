package SystemDesign.LowLevelDesign.ParkingLot;

import java.util.*;

import SystemDesign.LowLevelDesign.ParkingLot.ParkingFactory.*;

public class EntranceGate {
   
    List<ParkingSpot> vehicleList=new ArrayList<>();

    private VehicleFactoryInterface vehicleObj;
    
    private ParkingSpotManager SpotManager;

    public EntranceGate(VehicleFactoryInterface vehicleObj){
        this.vehicleObj=vehicleObj;
    }

    public ParkingSpotManager getVehicle(){
        this.SpotManager=vehicleObj.createVehicle();
        return this.SpotManager;
    }

}
