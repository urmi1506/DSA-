package Stack;

public class ImplementUsingArr {
    static int []arr;
    static int top;
    public ImplementUsingArr(){
       arr=new int [arr.length];
       top=-1;
    }
    static void push(int x){
        if(arr.length-top>1){
           arr[++top]=x;
        }
        else{
            System.out.println("stack overflow");
        }
    }
    static int pop(){
        if(top>=0){
            int ans=arr[top--];
            return ans; 
        }
        else{
            System.out.println("Stack underflow");
            return -1;
        }
    }
    static int peek(){
        if(top>=0){
            int ans=arr[top];
            return ans;
        }
        else{
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
