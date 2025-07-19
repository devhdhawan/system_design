package OOPS.ClassAndObjects;

// This code demonstrates the use of interfaces in Java
// Interfaces define a contract that classes can implement
// Difference between abstract classes and interfaces is that interfaces can only contain method signatures and constants, while abstract classes can have method implementations and instance variables.

interface Flyable{
    void fly(); // Abstract method to be implemented by classes that implement this interface
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

public class InterfaceExample {
    public static void main(String[] args){
        Flyable bird = new Bird(); // Create an instance of Bird which implements Flyable interface
        bird.fly(); // Call the fly method defined in the Flyable interface
    }
}
