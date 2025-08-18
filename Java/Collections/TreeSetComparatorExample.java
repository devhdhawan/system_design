package Collections;

import java.util.NavigableSet;
import java.util.TreeSet;




public class TreeSetComparatorExample {
    public static void main(String[] args) {
        NavigableSet<Pair> ts = new TreeSet<>();

        ts.add(new Pair(10,2));
        ts.add(new Pair(5,13));
        ts.add(new Pair(14,17));

        //Print First Element
        System.out.println("First Element:");
    }
}
