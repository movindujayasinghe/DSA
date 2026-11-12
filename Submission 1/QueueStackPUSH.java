
import java.util.Stack;

public class QueueStackPUSH {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Push / Enqueue
    public void enqueue(int data) {
        stack1.push(data);
        System.out.println(data + " inserted");
    }

    // Pop / Dequeue
    public int dequeue() {

        if (stack1.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        int removed = stack2.pop();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return removed;
    }

    public void display() {
        System.out.println("Queue: " + stack1);
    }

    public static void main(String[] args) {

        QueueStackPUSH q = new QueueStackPUSH();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Removed: " + q.dequeue());

        q.display();
    }
}
