package SystemDesign.FactoryPattern.VehicleFactoryPattern;

public class VehicleClient {
    
    private Vehicle pVehicle;

    public VehicleClient(VehicleFactoryInterface obj){
        this.pVehicle=obj.createVehicle();
    }

    public Vehicle getVehicle(){
        return pVehicle;
    }
}
