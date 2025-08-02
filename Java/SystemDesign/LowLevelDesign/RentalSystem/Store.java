package SystemDesign.LowLevelDesign.RentalSystem;


import SystemDesign.LowLevelDesign.RentalSystem.Product.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int storeId;
    String storeName;
    Location location;
    VehicleInventory vehicleInventory;
    List<Reservation> reservations=new ArrayList<>();

    public void addVehicle(Vehicle vehicle){
        this.vehicleInventory=new VehicleInventory();
        this.vehicleInventory.addVehicle(vehicle);
    }

    public void createReservation(Vehicle vehicle,User user, Location location){
        Reservation reservation=new Reservation(user,location,vehicle);
        reservations.add(reservation);
    }

    public int getStoreId() {
        return storeId;
    }
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }


    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    public VehicleInventory getVehicleInventory() {
        return vehicleInventory;
    }
    public void setVehicleInventory(VehicleInventory vehicleInventory) {
        this.vehicleInventory = vehicleInventory;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }
    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

}
