package Queue;

import java.util.Stack;

public class ImplementUsingStack{
    // enqueue operation
    Stack <Integer> s1=new Stack<>();
    // dequeue operation
    Stack <Integer> s2=new Stack<>();

    void push(int x){
        // transfer s1 element to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        // push element x in stack 1
        s1.push(x);
         // transfer s2 element to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    int pop(){
        if(!s1.isEmpty()){
            return s1.pop();
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        ImplementUsingStack queue = new ImplementUsingStack();

        // Enqueue elements
        queue.push(1);
        queue.push(2);
        queue.push(3);

        // Dequeue elements
        System.out.println(queue.pop()); 
        System.out.println(queue.pop()); 
        System.out.println(queue.pop()); 
        System.out.println(queue.pop()); 
    }
}