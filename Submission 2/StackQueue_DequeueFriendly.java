import java.util.Stack;

public class StackQueue_DequeueFriendly {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Enqueue
    public void enqueue(int data) {
        s1.push(data);
    }

    // Dequeue
    public int dequeue() {

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        if (s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return s2.pop();
    }

    // Display
    public void display() {
        System.out.println("Queue: " + s2 + " " + s1);
    }

    // Main method
    public static void main(String[] args) {

        StackQueue_DequeueFriendly queue = new StackQueue_DequeueFriendly();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue()); // 10
        System.out.println(queue.dequeue()); // 20

        queue.enqueue(40);

        System.out.println(queue.dequeue()); // 30
    }
}