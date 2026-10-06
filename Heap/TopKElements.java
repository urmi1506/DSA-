package Heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKElements {
    public static int[] topKFrequent(int[] nums, int k) {
        // cnt freq of each ele
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num ,map.getOrDefault(num ,0)+1);
        }
        // min heap freq -->>help to remove smallest freq ele
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) ->map.get(a)-map.get(b));
        // Top k freq ele
        for(int num :map.keySet()){
            minHeap.add(num);

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        // put heap ele into ans[]
        int []ans = new int[k];
        for(int i=0; i<k; i++){
            ans[i] =minHeap.poll();
        }
    return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] result = topKFrequent(nums, k);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}