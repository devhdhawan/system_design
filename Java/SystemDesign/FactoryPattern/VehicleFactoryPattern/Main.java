package SystemDesign.FactoryPattern.VehicleFactoryPattern;

public class Main {
    public static void main(String[] args){
        VehicleFactoryInterface twoWheelerfactory=new TwoWheelerFactoryInterface();
        VehicleClient client=new VehicleClient(twoWheelerfactory);

        Vehicle obj1=client.getVehicle();
        obj1.printVehicle();

        VehicleFactoryInterface fourWheelerfactory=new FourWheelerFactoryInterface();
        client=new VehicleClient(fourWheelerfactory);

        Vehicle obj2=client.getVehicle();
        obj2.printVehicle();

        VehicleFactoryInterface threeWheelerfactory=new ThreeWheelerFactoryInterface();
        client=new VehicleClient(threeWheelerfactory);

        Vehicle obj3=client.getVehicle();
        obj3.printVehicle();



    }
}
