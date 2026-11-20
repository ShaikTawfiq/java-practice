import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Ravan");
        queue.add("Sita");
        queue.add("Ram");
        System.out.println("Queue after enqueues: " + queue);
        System.out.println("Front element: " + queue.peek());
        String removedItem = queue.poll();
        System.out.println("Dequeued item: " + removedItem);
        System.out.println("Queue after dequeue: " + queue);
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
