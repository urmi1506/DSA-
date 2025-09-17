package Heap;

import java.util.PriorityQueue;

public class MinCost {
    public static int minCost(int[] costs) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int totalCost = 0;
        for (int cost : costs) {
            minHeap.add(cost);
        }
        while(minHeap.size() >=2) {
            int cost1 = minHeap.peek();
            minHeap.poll();
            int cost2 = minHeap.peek();
            minHeap.poll();
            totalCost =totalCost + cost1 + cost2;
            minHeap.add(cost1 + cost2);
        }
    return totalCost;
    }
    public static void main(String[] args) {
        int [] costs = {1,2,3,4,5};
        System.out.println(minCost(costs));
    }
}
