package SystemDesign.LowLevelDesign.RentalSystem;

import java.util.ArrayList;
import java.util.List;

import SystemDesign.LowLevelDesign.RentalSystem.Product.*;

public class VehicleInventory {
    List<Vehicle> vehicles=new ArrayList<>();


    // VehicleInventory(Vehicle vehicle){
    //     vehicles.add(vehicle);
    // }

    public Vehicle checkAvailability(Location location, String brand, String model){
        for(Vehicle v:vehicles){
            System.out.println(v);
            if(v.getLocation().city==location.city &&
                  v.getBrand()==brand && 
                    v.getModel()==model){
                System.out.println("We got the Vehicle");
                return v;
            }
        }
        System.out.println("No Vehicles Available now ");
        return null;
    }
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    public void removeVehicle(int id) {
        vehicles.removeIf(vehicle -> vehicle.getId() == id);
    }

    public void updateVehicle(Vehicle vehicle) {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getId() == vehicle.getId()) {
                vehicles.set(i, vehicle);
                return;
            }
        }
    }
}
