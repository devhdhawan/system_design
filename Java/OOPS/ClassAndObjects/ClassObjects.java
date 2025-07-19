package OOPS.ClassAndObjects;

class Person{
    String name;
    int age;

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ClassObjects {
    public static void main(String[] args) {
        // Create an object of the Person class
        Person person1 = new Person();
        
        // Assign values to the object's attributes
        person1.name = "John Doe";
        person1.age = 30;
        
        // Call the method to display information
        person1.displayInfo();
    }
}
