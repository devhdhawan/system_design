package SystemDesign.LowLevelDesign.RentalSystem;
import SystemDesign.LowLevelDesign.RentalSystem.Product.*;

public class Main {

    public static void main(String[] args) {
        // This is the entry point of the application
        Store store = createStore();
        Vehicle vehicle = addVehicle();
        User user=createUser();
        store.addVehicle(vehicle);


        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem();
        vehicleRentalSystem.addStore(store);
        vehicleRentalSystem.addUser(user);

        bookCar(user,store);

        for(Reservation r:store.reservations){
            Bill bill=new Bill(r);
            for(Vehicle v:store.vehicleInventory.vehicles){
                if(r.getRegNo().equals(v.getRegNo())){
                    bill.generateInvoice(v);
                }
            }
           
            // System.out.println(r.getReservationId());
            // System.out.println(r.getVehicleType());
            // System.out.println(r.getBookingTime());
            // System.out.println(r.getBookingStartDate());
            // System.out.println(r.getBookingEndDate());
            // System.out.println(r.getUser().userId);
            // System.out.println(r.getUser().userName);

        }

        
    }

    public static void bookCar(User user,Store store){
        VehicleInventory inventory=store.getVehicleInventory();
        Location location = new Location("Hinjewadi Phase 3", "Pune", "Maharashtra", "411057");
        
        Vehicle vehicle=inventory.checkAvailability(location,"Maruti Suzuki","Desire");

        if(vehicle==null){
            return ;
        }

        store.createReservation(vehicle,user,location);
        
    }
    public static Vehicle addVehicle(){
        Vehicle vehicle=new Vehicle();
        Location location = new Location("Hinjewadi Phase 2", "Pune", "Maharashtra", "411057");

        vehicle.setId(123);
        vehicle.setBrand("Maruti Suzuki");
        vehicle.setColor("White");
        vehicle.setModel("Desire");
        vehicle.setVehicleType(VehicleType.CAR);
        vehicle.setRegNo("MH12 QT 1234");
        vehicle.setSeatingCapacity(5);
        vehicle.setDailyRate(3300);
        vehicle.setHourlyRate(400);
        vehicle.setLocation(location);
        vehicle.setIsHourly(true);
        vehicle.setIsDaily(false);

        return vehicle;


    }

    public static User createUser(){
        User user = new User();
        user.setUserId(123);
        user.setLicenseNo("MHRT123456");
        user.setUserName("Pankaj");

        return user;
    }
    public static Store createStore() {
        Store store=new Store();
        Location location = new Location("Hinjewadi Phase 1", "Pune", "Maharashtra", "411057");
        store.setLocation(location);
        store.setStoreId(1);
        store.setStoreName("Zoom Car Rentals");

        return store;
        
    }
}
