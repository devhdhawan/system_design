package SystemDesign.LowLevelDesign.RentalSystem;

public class Location {
    String address;
    String city;
    String state;
    String zipCode;

    public Location(String address, String city, String state, String zipCode) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    
}
