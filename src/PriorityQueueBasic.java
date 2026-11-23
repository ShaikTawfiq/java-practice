import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueueBasic {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(60);
        pq.add(10);
        pq.add(40);
        pq.add(30);
        System.out.println("Priority Queue =" + pq);
        System.out.println("small element = " + pq.peek());

        int remove = pq.poll();
        System.out.println("Deleted element: " + remove);
        System.out.println("After Delete = " + pq);

        PriorityQueue<Integer> reversepq = new PriorityQueue<>(Comparator.reverseOrder());
        reversepq.addAll(pq);
        reversepq.add(80);
        System.out.println("Reversed PriorityQueue (largest first): " + reversepq);
    }
}
