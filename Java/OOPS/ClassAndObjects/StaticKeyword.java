package OOPS.ClassAndObjects;

class staticKeywordExample{
    static int staticVariable=100; // Static variable shared by all instances

    public static void staticMethod(){ // Static method can be called without creating an instance
        System.out.println("Static method called. Static variable value: " + staticVariable);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        // Accessing static variable without creating an instance
        System.out.println("Static variable value: " + staticKeywordExample.staticVariable);
        
        // Calling static method without creating an instance
        staticKeywordExample.staticMethod();
        
        
    }
}
