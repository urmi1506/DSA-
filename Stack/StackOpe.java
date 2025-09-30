import java.util.Stack;
class StackOpe{
    public static void main(String[] args) {
        Stack <Integer> s=new Stack<>();
        System.out.println("pushed elements are:");
        System.out.println( s.push(1));
        System.out.println( s.push(2));
        System.out.println( s.push(3));
        System.out.println( s.push(4));
        System.out.println("pop element are:" +s.pop());
        System.out.println("pop element are:" +s.pop());



        
    }
    private int[] arr;
    private int top;
    

    public StackOpe() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        // Your Code
        if(arr.length-top>1){
            top++;
            arr[top]=x;
        }
    }

    public int pop() {
        // Your Code
        if(top>=0){
            int ans=arr[top];
            top--;
            return ans;
        }
        else{
            return -1;
        }
    }
}
