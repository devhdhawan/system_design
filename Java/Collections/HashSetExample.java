package Collections;
import java.util.HashSet;
import java.util.Set;

// HashSet is a part of the Java Collections Framework and implements the Set interface.
// It is used to store unique elements and does not maintain any order of elements.

public class HashSetExample {
    public static void main(String[] args){
        // Create a HashSet
        Set<String> names=new HashSet<>();

        // Add elements to the HashSet
        names.add("Apple");
        names.add("Banana");
        names.add("Cherry");
        names.add("Apple"); // Duplicate element, will not be added 

        // Print the HashSet
        System.out.println("HashSet: " + names);

        //Remove an element
        names.remove("Banana");

        // Print the HashSet after removal
        System.out.println("HashSet after removal: " + names);

    }
}
