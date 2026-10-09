import java.util.Stack;

public class MiniStack {
    private static Stack<Integer>stack;
    public MiniStack() {
        stack = new Stack<>();
    }
    
    public static void push(int value) {
        stack.push(value);
    }
    
    public static void pop() {
        if(!stack.isEmpty()){
            stack.pop();
        }
    }
    
    public static int top() {
        return stack.isEmpty() ? -1 :stack.peek();
    }
    
    public static int getMin() {
        // Edge case
        if(stack.isEmpty())
           return -1;

        int min = Integer.MAX_VALUE;
        for(int val :stack){
            min = Math.min(min ,val);
        }
    return min;
    }
    public static void main(String[] args) {
        MiniStack.push(-2);
        MiniStack.push(0);
        MiniStack.push(-3);

        System.out.println(MiniStack.getMin());

        MiniStack.pop();

        System.out.println(MiniStack.top());

        System.out.println(MiniStack.getMin());
    }
}
