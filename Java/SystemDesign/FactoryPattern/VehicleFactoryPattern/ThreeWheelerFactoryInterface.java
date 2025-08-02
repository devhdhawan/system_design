package SystemDesign.FactoryPattern.VehicleFactoryPattern;

public class ThreeWheelerFactoryInterface implements VehicleFactoryInterface{
    public Vehicle createVehicle(){
        return new ThreeWheeler();
    }
}