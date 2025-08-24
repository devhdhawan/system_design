package Collections;
import java.util.*;
public class TreeSetExampleContinue {
    public static void main(String[] args) {
        NavigableSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(12);
        ts.add(5);
        ts.add(20);

        //Print First Element
        System.out.println("First:"+ts.first());

        System.out.println("Last:"+ts.last());

        System.out.println("Pop First:"+ts.pollFirst());

        System.out.println("Pop Second:"+ts.pollFirst());


    }
}
