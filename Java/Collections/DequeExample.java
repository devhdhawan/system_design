package Collections;
import java.util.ArrayDeque;
import java.util.Deque;


public class DequeExample {
    public static void main(String[] args){
        Deque<String> dq = new ArrayDeque<>();

        // Add elements to the Deque
        dq.add("Apple");
        dq.addFirst("Banana");
        dq.addLast("Cherry");

        // Print the Deque
        System.out.println("Deque: " + dq);

        //Remove elements from the Deque Last
        dq.removeLast();
        System.out.println("Deque after removing last: " + dq);

        //Remove elements from the Deque First
        dq.removeFirst();
        System.out.println("Deque after removing first: " + dq);
    }
}
