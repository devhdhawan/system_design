package SystemDesign.LowLevelDesign.ParkingLot;

public class Vehicle {
    String licensePlate;
    VehicleType vehicleType;
    
    public void setLicensePlate(String licensePlate) {
        this.licensePlate= licensePlate;
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public void setVehicleType(VehicleType vehicleType){
        this.vehicleType=vehicleType;
    }

    public VehicleType getVehicleType(){
        return vehicleType;
    }
}
