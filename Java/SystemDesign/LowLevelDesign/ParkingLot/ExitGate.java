package SystemDesign.LowLevelDesign.ParkingLot;

import SystemDesign.LowLevelDesign.ParkingLot.ParkingFactory.*;
import SystemDesign.LowLevelDesign.ParkingLot.PriceCalculation.*;

public class ExitGate {
    public PriceInterface priceObj;
    private ParkingSpotManager manager;
    private EntranceGate entranceGate;
    public void UpdateParkingSpot(ParkingSpot spot){
            manager.unparkVehicle(spot);
    }

    public boolean FindOccupiedParkingSpace(VehicleFactoryInterface obj,String licensePlate){

        entranceGate=new EntranceGate(obj);
        manager=entranceGate.getVehicle();
        
        for(ParkingSpot spot:manager.parkingSpots){
            if(spot.isAvailable==false && spot.vehicle.licensePlate.equals(licensePlate)){
                    double price=priceObj.CalculatePrice(spot.ticket,spot.rate);
                    this.UpdateParkingSpot(spot);
                    System.out.println("Price for vehicle with license plate " + licensePlate + " is: " + price);
                    return true;
            }
            
        }
        return false;
    }
    
    
}
