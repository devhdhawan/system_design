package SystemDesign.LowLevelDesign.ParkingLot;

import SystemDesign.LowLevelDesign.ParkingLot.ParkingFactory.*;
import SystemDesign.LowLevelDesign.ParkingLot.PriceCalculation.HourlyPriceCalculation;

import java.util.Scanner;




public class Main {
    public static Scanner input=new Scanner(System.in);
    public static void processVehicleEntry(VehicleFactoryInterface vehicleObj){
        
                EntranceGate entranceGate=new EntranceGate(vehicleObj);
                ParkingSpotManager SpotManager=entranceGate.getVehicle();
                System.out.println("  Select Find Free Space Parking Strategy ");
                System.out.println(" 1. Default Strategy ");
                int strategy_choice=input.nextInt();
                input.nextLine();
                ParkingSpot spot;
                
                spot=SpotManager.findFreeSpace(strategy_choice);
                
                System.out.println("Please Enter the vehicle license plate number:");
                String licensePlate=input.nextLine();
                spot.vehicle.setLicensePlate(licensePlate);
                SpotManager.parkVehicle(spot);
                
                spot.ticket=new Ticket();
                spot.ticket.generateTicket("10:00 AM", spot);
                
                entranceGate.vehicleList.add(spot);
    }

    

    public static void StartParkingVehicle(){

        Boolean openGate=true;

        
        VehicleFactoryInterface twoWheeler = new TwoWheelerFactory();
        VehicleFactoryInterface fourWheeler = new FourWheelerFactory();

        while(openGate){
            System.out.println("Welcome to the Parking Lot!");
            System.out.println("Please select your vehicle type:");
            System.out.println("1. Two Wheeler 2. Four Wheeler 3. Unpark the Vehicle 4. Exit");
            
            int choice=input.nextInt();
            input.nextLine();
            
            if(choice==1){
                System.out.println("Two Wheeler Parking Lot:");
                
                processVehicleEntry(twoWheeler);
            }else if(choice==2){
                
                processVehicleEntry(fourWheeler);
            }
            else if(choice==3){
                System.out.println(" Please Enter the Vehicle License Plate Number");
                String licensePlate=input.nextLine();

                System.out.println("Please Select the Payment Mode:");
                System.out.println("1. Hourly Payment 2. Minutes Payment");
                int paymentMode=input.nextInt();
                input.nextLine(); // Consume the newline character
                ExitGate exitGate=new ExitGate();
                if(paymentMode==1){
                    exitGate.priceObj=new HourlyPriceCalculation();
                }else if(paymentMode==2){
                }else{
                    System.out.println("Please Select the Valid Option");
                }
                
                boolean status=exitGate.FindOccupiedParkingSpace(twoWheeler,licensePlate);

                if(!status){
                    status=exitGate.FindOccupiedParkingSpace(fourWheeler,licensePlate);
                    if(!status){
                        System.out.println("Invalid License Plate Number:"+licensePlate);
                    }else{
                        System.out.println("Successfully Unparked the Vechicle with License Plate:"+licensePlate);
                    }
                }

            }
            else{
                openGate=false;
            }


        }
    }

    public static void main(String[] args) {
        StartParkingVehicle();
    }
}
