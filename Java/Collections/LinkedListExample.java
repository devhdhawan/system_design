package Collections;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args){
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.addFirst("Cherry");

        // Print the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Access elements using a loop
        for(int i = 0; i < linkedList.size(); i++) {
            System.out.println("Element at index " + i + ": " + linkedList.get(i));
        }

        // Access elements using a for-each loop
        for(String fruit : linkedList) {    
            System.out.println("Fruit: " + fruit);
        }

        // Remove an element
        linkedList.remove();

        //Remove the last element
        linkedList.removeLast(); //Remove Head Element
        // Print the LinkedList after removal
        System.out.println("LinkedList after removal: " + linkedList);
    }
}
