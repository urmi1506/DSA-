package Heap;

import java.util.PriorityQueue;

public class KsortedArr {
    public static void sort(int[] nums , int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int index = 0;

        for(int num : nums){
            minHeap.add(num);
            if(minHeap.size() > k){   
                nums[index++] = minHeap.poll();
            }
        }

        while(!minHeap.isEmpty()){
            nums[index++] = minHeap.poll();
        }

        for(int num : nums){
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int [] nums = {6,5,3,2,8,10,9};
        int k = 3;
        sort(nums,k);
    }
}
