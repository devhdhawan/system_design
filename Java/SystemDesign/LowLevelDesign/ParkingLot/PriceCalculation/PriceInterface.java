package SystemDesign.LowLevelDesign.ParkingLot.PriceCalculation;

import SystemDesign.LowLevelDesign.ParkingLot.*;

public interface PriceInterface {

    public Double CalculatePrice(Ticket ticket,int rate);    
} 