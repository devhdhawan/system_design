package Collections;
import java.util.ArrayList;

class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Print the ArrayList
        System.out.println("ArrayList: " + list);

        // Access elements using a loop
        for(int i=0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }

        // Access elements using a for-each loop
        for(String fruit : list) {
            System.out.println("Fruit: " + fruit);
        }

        // Remove an element
        list.remove("Banana");

        // Print the ArrayList after removal
        System.out.println("ArrayList after removal: " + list);
    }
}