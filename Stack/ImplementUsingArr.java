public class ImplementUsingArr {

    private int[] arr;
    private int top;

    // constructor
    public ImplementUsingArr(int size) {
        arr = new int[size];
        top = -1;
    }

    // push
    public void push(int x) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    // pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    // check empty
    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {

        ImplementUsingArr stack = new ImplementUsingArr(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        stack.pop();

        System.out.println("Top element after pop: " + stack.peek());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}