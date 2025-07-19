package OOPS.BasicOOPsPrinciple;
// Polymorphism is one of the four fundamental Object-Oriented Programming (OOP) principles.
// It allows methods to do different things based on the object that it is acting upon.
// There are two types of polymorphism in Java: compile-time (method overloading) and runtime (method overriding).

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    public void sound() { // Overriding the sound method
        System.out.println("Cat meows"); 
    }

    public void sound(String type) { // Overloaded method
        System.out.println("Cat makes a " + type + " sound");
    }
}

public class Polymorphism {
    public static void main(String[] args){
        Cat myCat = new Cat();
        myCat.sound(); // Calls the overridden method in Cat class

        myCat.sound("purring"); // Calls the overloaded method with a parameter
        myCat.sound("hissing"); // Calls the overloaded method with a different parameter
    }
}
