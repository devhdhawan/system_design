package SystemDesign.LowLevelDesign.ParkingLot.PriceCalculation;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import SystemDesign.LowLevelDesign.ParkingLot.*;

public class HourlyPriceCalculation implements PriceInterface{

    public Double CalculatePrice(Ticket ticket,int rate){
        LocalDateTime exitTime=LocalDateTime.now();
        LocalDateTime entryTime=ticket.entryTime;

        long hoursDifference=entryTime.until(exitTime,ChronoUnit.HOURS);

        Double price=(double) (rate*hoursDifference);

        System.out.println("Total hours parked: " + hoursDifference);

        return price;

    }
}
