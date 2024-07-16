package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementUsingQueue {
    Queue<Integer> Q1 = new LinkedList<>();
    Queue<Integer> Q2 = new LinkedList<>();

    void push(int x) {
        // Add element to Q2
        Q2.add(x);

        // Transfer all elements from Q1 to Q2
        while (!Q1.isEmpty()) {
            // poll method is used to retrieve and remove  head (front) of the queue, or return null if the queue is empty. 
            Q2.add(Q1.poll());
        }

        // Swap Q1 and Q2
        Queue<Integer> temp = Q1;
        Q1 = Q2;
        Q2 = temp;
    }

    int pop() {
        if (Q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return Q1.poll();
    }

    int top() {
        if (Q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return Q1.peek();
    }

    boolean isEmpty() {
        return Q1.isEmpty();
    }

    public static void main(String[] args) {
        ImplementUsingQueue stack = new ImplementUsingQueue();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.top()); 
        System.out.println(stack.pop()); 
        System.out.println(stack.top()); 
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty()); 
    }
}
