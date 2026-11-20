public class ArrayCircularQueue {

    int[] queue;
    int front = -1, rear = -1;
    int size;

    public ArrayCircularQueue(int size) {
        this.size = size;
        queue = new int[size];
    }

    public void enqueue(int data) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue Full");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        queue[rear] = data;
    }

    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue Empty");
            return -1;
        }

        int data = queue[front];

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return data;
    }

    public void display() {
        if (front == -1) {
            System.out.println("Empty");
            return;
        }

        int i = front;

        while (true) {
            System.out.print(queue[i] + " ");

            if (i == rear) break;

            i = (i + 1) % size;
        }
        System.out.println();
    }
}