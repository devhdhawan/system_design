package OOPS.BasicOOPsPrinciple;

// Encapsulation is one of the four fundamental Object-Oriented Programming (OOP) principles.
// It is the bundling of data (attributes) and methods (functions) that operate on that data into a single unit, or class.
// Purpose: Protects the internal state of an object and only exposes a controlled interface for interaction.
//  How it’s done: Mark data fields as private and provide public getter and setter methods.

class Person{
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John Doe");
        System.out.println("Person's name: " + person.getName());
    }
}
