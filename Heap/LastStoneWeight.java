package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        // Edge case :only one ele
        if(stones.length == 1){
            return stones[0];
        }
        // maxHeap -->want to destroy heavy weight
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());

        // add elements to heap
        for(int stone: stones){
            pq.offer(stone);
        }

        // want at least 2 stones
        while(pq.size() >1){
            int x = pq.poll();
            int y = pq.poll();

            if(x!=y){
                pq.offer(x-y);
            }
        }
    return pq.isEmpty() ? 0 : pq.peek();
    }
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }
}