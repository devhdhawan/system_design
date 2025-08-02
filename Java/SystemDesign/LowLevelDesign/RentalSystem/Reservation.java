package SystemDesign.LowLevelDesign.RentalSystem;

import java.time.LocalDateTime;

import SystemDesign.LowLevelDesign.RentalSystem.Product.*;

public class Reservation {
    int reservationId;
    String regNo;
    VehicleType vehicleType;
    LocalDateTime bookingTime;
    LocalDateTime bookingStartDate;
    LocalDateTime bookingEndDate;
    User user;
    Location location;
    BookingStatus bookingStatus;

    Reservation(User user,Location location,Vehicle vehicle){
        this.reservationId=19890;
        this.user=user;
        this.bookingStatus=BookingStatus.INPROGRESS;
        this.bookingTime = LocalDateTime.now().minusDays(7);
        this.bookingStartDate= LocalDateTime.now().minusDays(3);
        this.bookingEndDate = LocalDateTime.now().minusDays(2);
        this.location=location;
        this.vehicleType=vehicle.getVehicleType();
        this.regNo=vehicle.getRegNo();

    }

    public int getReservationId() {
        return reservationId;
    }
    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }


    public LocalDateTime getBookingStartDate() {
        return bookingStartDate;
    }

    public VehicleType getVehicleType(){
        return vehicleType;
    }
    

    public LocalDateTime getBookingEndDate() {
        return bookingEndDate;
    }
    

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public Location getLocation() {
        return location;
    }
    
    public String getRegNo(){
        return this.regNo;
    }

    
    

}
