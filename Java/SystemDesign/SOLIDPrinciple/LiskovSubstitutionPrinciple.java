package SystemDesign.SOLIDPrinciple;

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
