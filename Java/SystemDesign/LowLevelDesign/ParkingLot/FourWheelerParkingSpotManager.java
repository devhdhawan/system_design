package SystemDesign.LowLevelDesign.ParkingLot;

import java.util.ArrayList;

public class FourWheelerParkingSpotManager extends ParkingSpotManager {
    public FourWheelerParkingSpotManager(){
        ArrayList<ParkingSpot> parkingSpotsList=new ArrayList<>();

        for(int i=1;i<=10;i++){
            ParkingSpot spot = new ParkingSpot();
            VehicleType fourWheel = VehicleType.FourWheeler;
            Vehicle vehicle=new Vehicle();
            vehicle.setVehicleType(fourWheel); // Set the vehicle type to FourWheeler

            spot.spotId = i;
            spot.isAvailable = true; // Ensure the spot is available initially
            spot.vehicle=vehicle; // Assign a vehicle to the spot if needed
            parkingSpotsList.add(spot);
        }
        super(parkingSpotsList);
    }
}
