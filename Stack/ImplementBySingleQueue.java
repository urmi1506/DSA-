import java.util.LinkedList;
import java.util.Queue;

public class ImplementBySingleQueue {
    Queue <Integer> Q1=new LinkedList<>();
    
    public void push(int x) {
        int size = Q1.size();
        Q1.add(x);
       for(int i=0; i<size; i++){
         Q1.add(Q1.poll());
       }
    }
    
    
    public int pop() {
        if (Q1.isEmpty()) {
            return -1;
        }
        return Q1.poll();
    }
    
    public int top() {
         if (Q1.isEmpty()) {
            return -1;
        }
        return Q1.peek();
    }
    
    public boolean empty() {
        return Q1.isEmpty();
    }
}
