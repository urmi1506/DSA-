public class ImplementStack {

    int[] stack;
    int top;

    public ImplementStack(int n) {
        stack = new int[n];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public void push(int x) {
        if (!isFull()) {
            stack[++top] = x;
        }
    }

    public void pop() {
        if (!isEmpty()) {
            top--;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        return -1; 
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

