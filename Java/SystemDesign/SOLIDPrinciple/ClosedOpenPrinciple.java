package SystemDesign.SOLIDPrinciple;

// The Closed-Open Principle states that software entities should be open for extension but closed for 
//modification.
// This means that we can add new functionality without changing existing code, which helps in maintaining 
//the stability of the system.
// In this example, we define an abstract class Shape and its subclasses Circle and Rectangle.

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius; // Area of circle
    }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width; // Area of rectangle
    }
}

public class ClosedOpenPrinciple {
    public static void main(String[] args){
        Shape circle=new Circle(5); // Create a Circle object
        Shape rectangle=new Rectangle(4, 6); // Create a Rectangle object

        System.out.println("Area of Circle: " + circle.area()); // Calculate area of circle
        System.out.println("Area of Rectangle: " + rectangle.area()); // Calculate area of rectangle
    }
}
