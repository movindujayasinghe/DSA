
import java.util.LinkedList;
import java.util.Queue;

public class StackQueue_Enqueuefriendly {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Enqueue - O(1)
    void enqueue(int data) {
        q1.add(data);
    }

    // Dequeue - O(n)
    void dequeue() {

        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        System.out.println("Removed: " + q1.remove());

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public static void main(String[] args) {

        StackQueue_Enqueuefriendly s = new StackQueue_Enqueuefriendly();

        s.enqueue(10);
        s.enqueue(20);
        s.enqueue(30);

        s.dequeue();
        s.dequeue();
        s.dequeue();
    }
}
