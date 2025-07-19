package OOPS.ClassAndObjects;

// This code demonstrates the use of 'this' keyword in constructors
// to refer to the current object and to call another constructor


class UserInfo{
    String name;
    int age;

    // Constructor with parameters
    public UserInfo() {
        this("John Doe", 25); // Default values
    }
    public UserInfo(String name, int age) {
        this.name = name; // 'this' keyword refers to the current object
        this.age = age;   // It helps to distinguish between instance variables and parameters
    }

    void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class ConstructorThis {
    public static void main(String[] args) {
        // Create an object of the Person class using the default constructor
        UserInfo person1 = new UserInfo();
        
        // Call the method to display information
        person1.displayInfo();

        // Create an object of the Person class using the parameterized constructor
        UserInfo person2 = new UserInfo("Alice", 30);
        
        // Call the method to display information
        person2.displayInfo();
    }
}
