package Basics.Exception;

public class try_catch {
    public static void main(String[] args){
        Integer result = 0;
        try{
            result=10/0; // This will cause an ArithmeticException
            System.out.println("Result: " + result);
        }catch(Exception e){
            System.out.println("An error occurred: " + e.getMessage());
        }finally{
            System.out.println("This block always executes.");
        }   
    }
}
