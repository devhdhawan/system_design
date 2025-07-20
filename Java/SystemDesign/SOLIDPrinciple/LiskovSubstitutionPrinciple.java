package SystemDesign.SOLIDPrinciple;

// The Liskov Substitution Principle states that objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.

class Base {
    void display() {
        System.out.println("Base class display method");
    }
}

class Derived extends Base {
   
}

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args){
        Derived base = new Derived();
        base.display(); // This will call the display method from Base class
    }
}
