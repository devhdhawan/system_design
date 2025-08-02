package SystemDesign.FactoryPattern.VehicleFactoryPattern;

public class FourWheelerFactoryInterface implements VehicleFactoryInterface{
    
    public Vehicle createVehicle(){
        return new FourWheeler();
    }
}
