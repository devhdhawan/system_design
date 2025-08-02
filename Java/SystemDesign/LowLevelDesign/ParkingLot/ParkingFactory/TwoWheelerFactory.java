package SystemDesign.LowLevelDesign.ParkingLot.ParkingFactory;


import SystemDesign.LowLevelDesign.ParkingLot.TwoWheelerParkingSpotManager;

public class TwoWheelerFactory implements VehicleFactoryInterface {
    public TwoWheelerParkingSpotManager  SpotManager;
    public TwoWheelerParkingSpotManager createVehicle(){
        if(SpotManager==null){
            System.out.println(("GET Vehcicle "));
            this.SpotManager=new TwoWheelerParkingSpotManager();
        }
        return this.SpotManager;
    }
}
