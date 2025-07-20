package SystemDesign.LowLevelDesign.ParkingLot;

import java.util.ArrayList;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager {
    public TwoWheelerParkingSpotManager() {
        ArrayList<ParkingSpot> parkingSpotsList = new ArrayList<>();
        for(int i=1;i<=10;i++){
            ParkingSpot spot = new ParkingSpot();
            VehicleType twoWheel = VehicleType.TwoWheeler;
            Vehicle vehicle = new Vehicle(); // Assuming Vehicle class exists
            vehicle.setVehicleType(twoWheel); // Set the vehicle type to TwoWheeler

            spot.spotId = i;
            spot.isAvailable = true; // Ensure the spot is available initially
            spot.vehicle=vehicle; // Assign a vehicle to the spot if needed
            parkingSpotsList.add(spot);
        }
        super(parkingSpotsList);
    }
}
