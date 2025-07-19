package OOPS.ClassAndObjects;

// This class demonstrates the use of constructors in Java.
// A constructor is a special method that is called when an object is instantiated.
// It is used to initialize the object's attributes.
// Purpose: To show how constructors can be used to set initial values for object attributes.
// How it’s done: Define a constructor with the same name as the class and no return type.

class Animal{
    String name;
    int age;

    // Constructor to initialize the attributes
    Animal(String name, int age) {
        System.err.println("Constructor called: Initializing Animal object");
        this.name = name;
        this.age = age;
    }

    // Method to display animal information
    void displayInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Age: " + age);
    }
}
public class Construtor {
    public static void main(String[] args) {
        // Create an object of the Animal class using the constructor
        Animal animal1 = new Animal("Lion", 5);
        
        // Call the method to display information
        animal1.displayInfo();
    }
}
