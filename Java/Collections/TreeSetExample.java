package Collections;
import java.util.TreeSet; 
import java.util.Set;
// TreeSet is a part of the Java Collections Framework and implements the Set interface.
// It is a NavigableSet that uses a Red-Black tree structure to store elements in sorted order.
// Elements in a TreeSet are unique and sorted according to their natural ordering or by a specified comparator.


public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet
        Set<String> treeset = new TreeSet<>();

        // Add elements to the TreeSet
        treeset.add("Banana");
        treeset.add("Apple");
        treeset.add("Cherry");

        // Print the TreeSet
        System.out.println("TreeSet: " + treeset);

        // Access elements using a for-each loop
        for (String fruit : treeset) {
            System.out.println("Fruit: " + fruit);
        }
        // Check if an element exists
        if (treeset.contains("Banana")) {   
            System.out.println("Banana is in the TreeSet.");
        } else {
            System.out.println("Banana is not in the TreeSet.");
        }
    }
}

