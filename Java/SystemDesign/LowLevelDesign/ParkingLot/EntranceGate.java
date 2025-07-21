package SystemDesign.LowLevelDesign.ParkingLot;

import java.util.Scanner;

public class EntranceGate {
    Ticket ticket;
    Scanner scanner = new Scanner(System.in);
    public void processVehicleEntry(ParkingSpotManager manager){
    
        System.out.println("Select the Strategy to Find Parking Space");
        System.out.println("1. Default Strategy");
        int choice=scanner.nextInt();
        scanner.nextLine();
        ParkingSpot spot=manager.findFreeSpace(choice);

        System.out.println("Please Enter the vehicle license plate number:");
        String licensePlate = scanner.nextLine();
        System.out.println(licensePlate + " is the license plate number of your vehicle.");
        spot.vehicle.setLicensePlate(licensePlate);

        manager.parkVehicle(spot);

        ticket = new Ticket();
        String entryTime= "10:00 AM"; // This should be replaced with actual time logic
        ticket.generateTicket(entryTime,spot);

        
        System.out.println("Vehicle entry processed successfully.");
    }
    public void openGate(){
        boolean gateOpen = true;
        TwoWheelerParkingSpotManager twoWheelerManager = new TwoWheelerParkingSpotManager();
        FourWheelerParkingSpotManager fourWheelerManager = new FourWheelerParkingSpotManager();
        Scanner scanner = new Scanner(System.in);
        while(gateOpen){
            System.out.println("Welcome to the Parking Lot!");
            System.out.println("Please select your vehicle type:");
            System.out.println("1. Two Wheeler 2. Four Wheeler 3. Exit");
            
            
            int choice = scanner.nextInt();
            
            if(choice==1){
                ParkingSpotManager twoWheelerSpotManager = twoWheelerManager;
                processVehicleEntry(twoWheelerSpotManager);
            }else if(choice==2){
                ParkingSpotManager fourWheelerSpotManager = fourWheelerManager;
                processVehicleEntry(fourWheelerSpotManager);
            }else if(choice==3){
                gateOpen = false;
            }
            else {
                System.out.println("Invalid choice. Please try again.");
            }

            
        }
        scanner.close();

    }
}
