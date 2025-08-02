package SystemDesign.LowLevelDesign.RentalSystem;

import SystemDesign.LowLevelDesign.RentalSystem.Product.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Bill {
    LocalDateTime startDate;
    LocalDateTime endDate;
    double totalPrice;
    double rate;
    long hoursDifference;

    Bill(Reservation reservation){
        this.startDate=reservation.getBookingStartDate();
        this.endDate=reservation.getBookingEndDate();
    }

    public void generateInvoice(Vehicle vehicle){
        if(vehicle.getIsHourly()){
            this.rate=vehicle.getHourlyRate();
            this.hoursDifference=this.startDate.until(this.endDate,ChronoUnit.HOURS);
            this.totalPrice=this.rate*hoursDifference;

            System.out.println("Vehicle RegNo:"+vehicle.getRegNo());
            System.out.println("Vehicle Location:"+vehicle.getLocation().city);
            System.out.println("Vehicle Brand:"+vehicle.getBrand());
            System.out.println("Vehicle Model:"+vehicle.getModel());
            System.out.println("Vehicle Hourly Rate:"+rate);
            System.out.println("Booking Start Time:"+this.startDate);
            System.out.println("Booking End Time:"+this.endDate);
            System.out.println("Total Time Consumed:"+this.hoursDifference);
            System.out.println("Total Cost:"+this.totalPrice);


        }else{
            this.rate=vehicle.getDailyRate();
            this.hoursDifference=this.startDate.until(this.endDate,ChronoUnit.DAYS);
            this.totalPrice=this.rate*hoursDifference;

            System.out.println("Vehicle RegNo:"+vehicle.getRegNo());
            System.out.println("Vehicle Location:"+vehicle.getLocation());
            System.out.println("Vehicle Brand:"+vehicle.getBrand());
            System.out.println("Vehicle Model:"+vehicle.getModel());
            System.out.println("Vehicle Daily Rate:"+rate);
            System.out.println("Bookint Start Time:"+this.startDate);
            System.out.println("Bookint End Time:"+this.endDate);
            System.out.println("Total Time Consumed:"+this.hoursDifference);
            System.out.println("Total Cost:"+this.totalPrice);
        }
    }

}
