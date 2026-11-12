import java.util.Stack;

public class QueueStack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void push(int x) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        s1.push(x);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    void pop() {
        if (s1.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println(s1.pop());
        }
    }

    public static void main(String[] args) {

        QueueStack q = new QueueStack();

        q.push(10);
        q.push(20);
        q.push(30);

        q.pop();
        q.pop();
        q.pop();
    }
}