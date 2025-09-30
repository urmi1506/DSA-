
public class StackImplement {
    private int[] arr; 
    private int top;   
    private int maxSize; 
    public StackImplement(int maxSize) {
        this.arr = new int[maxSize];
        this.top = -1; 
        this.maxSize = maxSize;
    }

    // Push operation 
    public void push(int ele) {
        if (top < maxSize - 1) {  
            arr[++top] = ele;    
            System.out.println("Pushed element: " + ele);
        } else {
            System.out.println("Stack overflow");
        }
    }

    // Pop operation 
    public int pop() {
        if (top >= 0) {  
            int poppedElement = arr[top--];  
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        } else {
            System.out.println("Stack underflow");
            return -1;  
        }
    }

    public int peek() {
        if (top >= 0) {  
            return arr[top]; 
        } else {
            System.out.println("Stack empty");
            return -1;  
        }
    }

    public boolean isEmpty() {
        return (top == -1);  
    }

    public static void main(String[] args) {
        StackImplement stack = new StackImplement(5);  
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());
        stack.pop();
        System.out.println("Top element after pop: " + stack.peek());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
