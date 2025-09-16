package Heap;

import java.util.Map;
import java.util.PriorityQueue;

public class FreqSort {
    public static int[] topKFrequent(int[] nums){
        int n=nums.length;
        Map<Integer,Integer> freq = new java.util.HashMap<>();
        for(int num : nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }   
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            minHeap.add(new int[]{entry.getKey(),entry.getValue()});
        }
        while(!minHeap.isEmpty()){
            System.out.print(minHeap.poll()[0]+" ");
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int[] result = topKFrequent(nums);
        for(int num : result){
            System.out.print(num);
        }
    }
}
