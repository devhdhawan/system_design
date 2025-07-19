package OOPS.BasicOOPsPrinciple;

// Inheritance is one of the four fundamental Object-Oriented Programming (OOP) principles.
// It allows a new class (subclass or derived class) to inherit attributes and methods from an existing class (superclass or base class).
// Purpose: Promotes code reusability and establishes a hierarchical relationship between classes.

class Animal {
    public void eats() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eats(); // Inherited method from Animal class
        dog.bark(); // Method from Dog class
    }
}
