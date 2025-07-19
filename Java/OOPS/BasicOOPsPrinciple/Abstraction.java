package OOPS.BasicOOPsPrinciple;

abstract class Animals {
    // Abstract method (does not have a body)
    public abstract void sound();
   
}

class Dog extends Animals {
    // The body of sound() is provided here
    public void sound() {
        System.out.println("Dog barks");
    }
   
}

class Cat extends Animals {
    // The body of sound() is provided here
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Abstraction {
     public static void main(String[] args) {
        Dog myDog = new Dog(); // Create a Dog object
        Cat myCat = new Cat(); // Create a Cat object

        myDog.sound(); // Call the sound method on Dog
        myCat.sound(); // Call the sound method on Cat
    }
}
