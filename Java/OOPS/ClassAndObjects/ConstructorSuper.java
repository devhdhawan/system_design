package OOPS.ClassAndObjects;

// This code demonstrates the use of super keyword in constructors
// to call the parent class constructor


class WildAnimal{
    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Lion extends WildAnimal{
    public void eat(){
        super.eat(); // Call the eat method from Animal class
        System.out.println("Lion is barking");
    }
}

public class ConstructorSuper {
    public static void main(String[] args){
        WildAnimal lion = new Lion();
        lion.eat(); // Calls the bark method which in turn calls the eat method from Animal class
    }
}
