import java.util.Stack;

public class SimpleStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("After push: " + stack);
        System.out.println("Top element: " + stack.peek());

        String removedItem = stack.pop();
        System.out.println("Popped item: " + removedItem);
        System.out.println("After pop: " + stack);


        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}