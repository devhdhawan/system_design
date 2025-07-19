package OOPS.ClassAndObjects;

// This code demonstrates the use of abstract classes and methods
// Abstract classes cannot be instantiated and are meant to be subclassed
// Subclasses must implement the abstract methods defined in the abstract class

abstract class Vehicle{
    int speed;

    public abstract void start(); // Abstract method to be implemented by subclasses
    void setSpeed(int speed){
        this.speed = speed;
    }
}

class Car extends Vehicle{
    
    public void start() {
        System.out.println("Car is starting with speed: " + speed);
    }
}

public class AbstractClass {
    public static void main(String[] args){
        Vehicle myCar=new Car(); // Create an instance of Car
        myCar.setSpeed(60); // Set speed using the method from Vehicle class
        myCar.start(); // Call the start method implemented in Car class
    }
}
