package Heap;

import java.util.PriorityQueue;

public class kLargestElements {
    public static void kLargest(int[] nums ,int k){
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int num:nums){
            minHeap.add(num);
            if(minHeap.size()>k){
                // remove smallest element 
                minHeap.poll();
            }
        }
        while (minHeap.size()>0) {
            System.out.print(minHeap.poll());
            
        }
    }
    public static void main(String[] args) {
        int nums[]={3,2,1,5,6,4};
        int k=2;
        kLargest(nums, k);
        
    }
}
