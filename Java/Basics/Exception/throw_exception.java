package Basics.Exception;

public class throw_exception {
    public static void main(String[] args)
    {
        Integer age = 20;
        if(age<18){
            throw new ArithmeticException("Age must be 18 or older.");
        } else {
            System.out.println("You are eligible.");
        }
    }
}
