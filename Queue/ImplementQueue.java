package Queue;

public class ImplementQueue {
    int arr[];
     int size;
     int n;
    // Constructor
    public ImplementQueue(int n) {
        // Define Data Structures
        this.n =n;
        arr = new int[n];
        size=0;
        
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return size == 0;
    }

    public boolean isFull() {
        // Check if queue is full
        return size == n;
    }

    public void enqueue(int x) {
        // Enqueue
        if(!isFull()){
            arr[size++] =x;
        }
    }

    public void dequeue() {
        // Dequeue
        if(!isEmpty()){
            for(int i=1 ; i<size; i++){
                arr[i-1] =arr[i];
            }
            size--;
        }
    }

    public int getFront() {
        // Get front element
        if(size == 0) return -1;
        return arr[0];
    }

    public int getRear() {
        // Get last element
        if(isEmpty()) return -1;
        return arr[size-1];
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
