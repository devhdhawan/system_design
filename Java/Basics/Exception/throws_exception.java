package Basics.Exception;

public class throws_exception {
    void function() throws ArithmeticException {
        throw new ArithmeticException("This is a custom exception message.");
    }
    public static void main(String[] args) {
        throws_exception thro_exception = new throws_exception();
        try{
            thro_exception.function();
        }catch(ArithmeticException e){
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
