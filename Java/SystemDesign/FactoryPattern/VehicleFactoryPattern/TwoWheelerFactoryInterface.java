package SystemDesign.FactoryPattern.VehicleFactoryPattern;

public class TwoWheelerFactoryInterface implements VehicleFactoryInterface {
    
    public Vehicle createVehicle(){
        return new TwoWheeler();
    }
}
