package OOPS.ClassAndObjects;

final class FinalKeywordExample{ // This class cannot be extended because it is declared as final
    final int finalVariable = 10; // Final variable cannot be changed once initialized

    public final void displayFinalVariable() { // Final method cannot be overridden in subclasses
        System.out.println("Final variable value: " + finalVariable);
    }
}

public class FinalKeyword {
    public static void main(String[] args){
        FinalKeywordExample example = new FinalKeywordExample();
        
        // Display the final variable value
        example.displayFinalVariable();
        
        
    }
}
