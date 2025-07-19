package Collections;
import java.util.LinkedList;
import java.util.Queue; //FIFO - First In First Out

public class QueueExample {
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<>();

        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        System.out.println("Queue: " + queue);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Queue after poll: " + queue);

        // Access elements using a loop
        for(String fruit : queue) {
            System.out.println("Fruit: " + fruit);
        }

        // Check if the queue is empty
        if(queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue is not empty.");
        }
    }
}