package Heap;

import java.util.PriorityQueue;

public class KClosestOrigin {
    public static void kClosest(int[][] nums, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int[] point : nums) {  
            int dist = point[0] * point[0] + point[1] * point[1];
            maxHeap.add(new int[]{dist, point[0], point[1]});
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        while (maxHeap.size() > 0) {
            int[] p = maxHeap.poll();
            System.out.print("(" + p[1] + "," + p[2] + ") ");
        }
    }

    public static void main(String[] args) {
        int [][] points = {{1,3},{-2,2},{5,8},{0,1}};
        int k = 2;
        kClosest(points,k);
    }
}
