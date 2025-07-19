package Basics;

public class Loops {

    public static void main(String[] args){
        // For loop example
        for(int i=0;i<5;i++){
            System.out.println("For Loop iteration: " + i);
        }

        //For-each loop example
        String[] names={"Arti","Himanshu","Tanya"};
        for(String name: names){
            System.out.println("For-each Loop name: " + name);
        }

        // While loop example
        int j=0;
        while(j<5){
            System.out.println("While Loop iteration: " + j);
            j++;
        }

        // Do-while loop example
        int k=0;
        do{
            System.out.println("Do-while Loop iteration: " + k);
            k++;
        } while(k<5);
    }
    
}
