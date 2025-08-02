package SystemDesign.LowLevelDesign.ParkingLot.ParkingFactory;

import SystemDesign.LowLevelDesign.ParkingLot.FourWheelerParkingSpotManager;

public class FourWheelerFactory implements VehicleFactoryInterface{
    FourWheelerParkingSpotManager SpotManager;
    public FourWheelerParkingSpotManager createVehicle(){
        if(SpotManager==null){
            System.out.println(("GET Vehcicle "));
            this.SpotManager=new FourWheelerParkingSpotManager();
        }
        return this.SpotManager;
    }
}
