package SystemDesign.LowLevelDesign.RentalSystem.Product;
import java.time.LocalDateTime;

import SystemDesign.LowLevelDesign.RentalSystem.*;

public class Vehicle {
    int id;
    String regNo;
    String model;
    String color;
    String brand;
    VehicleType vehicleType;
    int seatingCapacity;
    double hourlyRate;
    double dailyRate;
    Status status;
    Location location;
    LocalDateTime bookingStarDate;
    LocalDateTime bookingEndDate;
    Boolean isHourly;
    Boolean isDaily;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getRegNo() {
        return regNo;
    }
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getModel() {
        return model;
    }   
    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }
    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getDailyRate() {
        return dailyRate;
    }
    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public Location getLocation(){
        return location;
    }
    public void setLocation(Location location){
        this.location=location;
    }


    public Boolean getIsHourly(){
        return this.isHourly;
    }
    public void setIsHourly(Boolean isHourly){
        this.isHourly=isHourly;
    }

    public Boolean getIsDaily(){
        return this.isDaily;
    }
    public void setIsDaily(Boolean isDaily){
        this.isDaily=isDaily;
    }
}
