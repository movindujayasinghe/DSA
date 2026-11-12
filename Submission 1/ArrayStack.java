
public class ArrayStack {

    int[] arr = new int[2];
    int top = -1;

    void push(int value) {

        if (top == arr.length - 1) {
            int[] temp = new int[arr.length * 2];

            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }

            arr = temp;
        }

        arr[++top] = value;
    }

    void pop() {

        if (top == -1) {
            System.out.println("Stack Empty");
            return;
        }

        System.out.println("Removed: " + arr[top]);
        top--;

        if (top + 1 <= arr.length / 4 && arr.length > 2) {

            int[] temp = new int[arr.length / 2];

            for (int i = 0; i <= top; i++) {
                temp[i] = arr[i];
            }

            arr = temp;
        }
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        ArrayStack s = new ArrayStack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.display();

        s.pop();
        s.pop();

        s.display();
    }
}
