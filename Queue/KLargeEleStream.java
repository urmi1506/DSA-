package Queue;

import java.util.PriorityQueue;

public class KLargeEleStream {

    private int k;
    private PriorityQueue<Integer> pq;

    public KLargeEleStream(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>(k);
        for (int num : nums) {
            pq.offer(num);
            if (pq.size() > k) pq.poll(); 
        }
    }
    
    public int add(int val) {
        pq.offer(val); 
        if (pq.size() > k) pq.poll();
        return pq.peek(); 
    }

    public static void main(String[] args) {
        int[] initialNumbers = {4, 5, 8, 2};
        KLargeEleStream kthLargest = new KLargeEleStream(3, initialNumbers);
        System.out.println(kthLargest.add(3));   
        System.out.println(kthLargest.add(5));   
        System.out.println(kthLargest.add(10));  
        System.out.println(kthLargest.add(9));   
        System.out.println(kthLargest.add(4));   
    }
}
