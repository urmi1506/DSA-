package Heap;

import java.util.PriorityQueue;

public class KthLargestEle {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();        
    }
    public static void main(String[] args) {
        int nums[]={3,2,3,1,2,4,5,6};
        int k=3;
        System.out.println(findKthLargest(nums, k));
    }
}
