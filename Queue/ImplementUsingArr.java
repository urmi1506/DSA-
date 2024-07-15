package Queue;

public class ImplementUsingArr {
    private int front, rear, cnt;
    private int[] arr;
    private int n;

    public ImplementUsingArr(int size){
        front = 0;
        rear = 0;
        cnt = 0;
        n = size;
        arr = new int[n];
    }

    public void push(int x){
        if(cnt == n){
            System.out.println("Queue is full");
        } else {
            arr[rear % n] = x;
            rear++;
            cnt++;
        }
    }

    public int pop(){
        if(cnt == 0){
            System.out.println("Queue is empty");
            return -1;
        } else {
            int ans = arr[front % n];
            front++;
            cnt--;
            return ans;
        }
    }

    public int peek(){
        if (cnt == 0) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return arr[front % n]; 
        }
    }

    public boolean isFull(){
        return cnt == n;
    }

    public boolean isEmpty(){
        return cnt == 0;
    }

    public static void main(String[] args) {
        ImplementUsingArr queue = new ImplementUsingArr(5);

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);

        System.out.println("Peek: " + queue.peek()); 
        System.out.println("Pop: " + queue.pop()); 
        System.out.println("Pop: " + queue.pop());
        queue.push(6);

        System.out.println("Peek: " + queue.peek()); 
        System.out.println("Is Full: " + queue.isFull()); 
        System.out.println("Is Empty: " + queue.isEmpty()); 
    }
}
