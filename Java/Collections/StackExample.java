package Collections;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args){
        // Create a stack
        Stack<String> st = new Stack<>();
        // Push elements onto the stack
        st.push("Apple");
        st.push("Banana");
        st.push("Cherry");

        // Print the stack
        System.out.println("Stack: " + st);

        // Peek at the top element
        System.out.println("Peek: " + st.peek());

        // Pop an element from the stack
        System.out.println("Popped: " + st.pop());

        // Print the stack after popping
        System.out.println("Stack after pop: " + st);

        // Check if the stack is empty
        if(st.isEmpty()) {  
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty.");
        }

        // Access elements using a loop
        for(int i = 0; i < st.size(); i++) {
            System.out.println("Element at index " + i + ": " + st.get(i));
        }

        // Access elements using a for-each loop
        for(String fruit : st) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
